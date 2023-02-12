package com.kayalprints.calculator.classes;

import android.util.Log;

import androidx.annotation.NonNull;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressionTree {
    private final StringBuilder RE, tree;
    private Node root;
    private boolean isOkExp;
    private double expValue;


    public ExpressionTree(@NonNull String RE) {
        this.RE = new StringBuilder(RE.length());
        this.tree = new StringBuilder();
        this.RE.append(RE);
        this.root = null;
    }

    public ExpressionTree() {
        this.RE = new StringBuilder();
        this.tree = new StringBuilder();
        this.root = null;
    }

    public void addExp(String exp) {
        RE.delete(0,RE.length());
        this.RE.append(exp);
    }

    public void clearExpTree() {
        RE.delete(0,RE.length());
        tree.delete(0,tree.length());
        this.root = null;
        this.expValue = 0;
        this.isOkExp = false;
    }

    public StringBuilder getRE() {return this.RE;}
    public StringBuilder getTree() {return this.tree;}

    public double getExpValue() {
        return this.expValue;
    }

    private void refreshRoot() {
        while(root.getParent() != null) root = root.getParent();
     }

     private boolean checkSign(char c) {
        if((int)c == 46) return false;
        return ((int)c >= 42 && (int)c <= 47 || (int)c == 94);
     }

     private int precedence(char c) {
         switch ((int) c) {
             case 43:
                 return 0;
             case 45:
                 return 1;
             case 47:
                 return 2;
             case 42:
                 return 3;
             case 94:
                 return 4;
             default:
                 return -1;
         }
     }
     private void make() {
        for(int i=0; i<this.RE.length();) {
            if(checkSign(RE.charAt(i))) {
                char nextSign = RE.charAt(i++);
                insertSign(nextSign);
                refreshRoot();
            } else {
                StringBuilder nextNum = new StringBuilder(5);
                do {
                    nextNum.append(RE.charAt(i++));
                    if(i >= RE.length()) break;
                } while(!checkSign(RE.charAt(i)));
                insertNum(String.valueOf(nextNum));
                refreshRoot();
            }
        }
     }

     private boolean insertSign(char c) {
        if(this.root != null) {
            Node node = root;
            while (node.getLhsNode() != null && !checkSign(node.getValue().charAt(0))) {
                if(node.getRhsNode() != null) node = node.getRhsNode();
                else break;
            }
            while (node != null) {
                if (checkSign(node.getValue().charAt(0))) {
                    if (precedence(c) < precedence(node.getValue().charAt(0))) {
                        return createNInsert(node, String.valueOf(c));
                    } else if(checkLR(node,String.valueOf(c))) return true;
                    node = node.getRhsNode();
                } else
                    return createNInsert(node,String.valueOf(c));
            }
        }
         this.root = new Node(String.valueOf(c),null);
         return true;
     }

     private boolean insertNum(String c) {
         if(this.root != null) {
             Node node = root;
             while (true) {
                 if (checkSign(node.getValue().charAt(0))) {
                     if(checkLR(node,c)) return true;
                     node = node.getRhsNode();
                 } else return true;
             }
         }
         this.root = new Node(c,null);
         return true;
     }

    private boolean createNInsert(Node node, String c) {
        Node newNode = new Node(c, node, null, node.getParent());
        if(node.getParent() != null) node.getParent().setRhsNode(newNode);
        return node.setParent(newNode);
    }

    private boolean checkLR(Node node, String c) {
        if(node.getLhsNode() == null) return node.setLhsNode(new Node(c,node));
        if (node.getRhsNode() == null) return node.setRhsNode(new Node(c,node));
        return false;
    }

    public boolean canGetValue() {
        String expressionFormat = "[[0-9]*[\\.^]?[0-9]*[+*/-][0-9]*[\\.^]?[0-9]*]+";
        Pattern pattern = Pattern.compile(expressionFormat);
        Matcher matcher = pattern.matcher(RE);
        if(matcher.matches()) {
            make();
            this.expValue = calculateValue(this.root);
            initializePrinting();
            Log.i("test","in calGetValue() -- "+getTree());
            return this.isOkExp;
        }
        return false;
    }
    private double calculateValue(Node node) {
        try {
            this.isOkExp = true;
            if (checkSign(node.getValue().charAt(0))) {
                switch ((int) node.getValue().charAt(0)) {
                    case 43:
                        return (calculateValue(node.getLhsNode()) + calculateValue(node.getRhsNode()));
                    case 45:
                        return (calculateValue(node.getLhsNode()) - calculateValue(node.getRhsNode()));
                    case 47:
                        return (calculateValue(node.getLhsNode()) / calculateValue(node.getRhsNode()));
                    case 42:
                        return (calculateValue(node.getLhsNode()) * calculateValue(node.getRhsNode()));
                    case 94:
                        return Math.pow(calculateValue(node.getLhsNode()), calculateValue(node.getRhsNode()));
                    default: this.isOkExp = false; return 0;
                }
            }
        } catch (Exception e) {
            System.out.println("Expression not ok.");
            this.isOkExp = false;
            return 0;
        }
        return Double.parseDouble(node.getValue());  // Here should use try..catch number parsing NumberException
    }

     public void initializePrinting() {
        printTree(this.root);
        System.out.println();
     }
     private void printTree(Node n) {
        if(n != null) {
            tree.append(n.getValue()).append(" ");
            printTree(n.getLhsNode());
            printTree(n.getRhsNode());
        }
     }
}