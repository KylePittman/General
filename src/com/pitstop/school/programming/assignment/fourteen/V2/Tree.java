//Kyle Pittman 6/10/2015.
package com.pitstop.school.programming.assignment.fourteen.V2;

/**
 * Main Class for the Binary Expression tree
 * Takes in a postfix equation and Constructs a Binary Tree from it
 * Can read pre, post, and infix (with parenthesis)
 * Can simplify individual steps in order
 * Can Solve a given equation
 */
public class Tree {

    private Head head;
    private Stack stack;

    /**
     * Constructs an empty tree
     */
    public Tree() {
        head = new Head();
    }

    /**
     * Postfix tree constructor
     *
     * @param postfix expression in postfix notation to be turned into tree
     */
    public Tree(String postfix) {
        head = new Head();
        createFromPostfix(postfix);
    }

    /**
     * Creates the tree from postfix expression
     * Calls the recursive postFixTreeConstructor on the root
     *
     * @param postfix expression in postfix notation to be turned into tree
     */
    public void createFromPostfix(String postfix) {
        stack = new Stack();
        stack.stackString(postfix);
        TwoChildNode temp = new TwoChildNode(stack.pop());  //Creates a root for the tree from the least significant operator
        head.setNext(temp);                                 //Sets root to least important operator

        postfixTreeConstructor(temp);                       //Calls the recursive constructor on the new root to build tree
    }

    /**
     * Recursive tree constructor
     * Constructs from root, to lower right all the way left
     *
     * @param c TwoChildNode to construct below
     */
    private void postfixTreeConstructor(TwoChildNode c) {
        //end recursion and construction when stack is empty
        if (stack.isEmpty())
            return;

        //pops next item to be inserted into the tree into a new TwoChildNode
        char aChar = (Character) stack.pop();
        TwoChildNode temp = new TwoChildNode(aChar);

        //inserts item into the tree
        c.setRight(temp);

        /*continue constructing tree if the new node was an operator
        *because all operators should have two children and all
        *numbers should have none
        */
        if (charCompare(aChar) > 0)
            postfixTreeConstructor(temp);

        //After going right, go left

        //pops next item to be inserted into the tree into a new TwoChildNode
        aChar = (Character) stack.pop();
        temp = new TwoChildNode(aChar);

        //inserts item into the tree
        c.setLeft(temp);

        /*continue constructing tree if the new node was an operator
        *because all operators should have two children and all
        *numbers should have none
        */
        if (charCompare(aChar) > 0)
            postfixTreeConstructor(temp);
    }

    /**
     * Gets inOrder traversal of the tree, properly parenthesized
     * Calls recursive getInfix on the root of the tree
     *
     * @return String infix notation of the equation
     */
    public String getInfix() {
        return getInfix(head.getNext());
    }

    /**
     * Recursive method to get the infix notation with proper parenthesis
     * Return this TwoChildNode's info between the node to the left and the node to right's info and subsequent info
     * Example:
     * A
     * / \
     * B   C
     * / \ / \
     * D  E F  G
     * <p/>
     * Returns: D B E A F C G
     *
     * @param c TwoChildNode to get the children of
     * @return String of the infix notation
     */
    private String getInfix(TwoChildNode c) {

        if (c.getLeft() != null && c.getRight() != null) {

            //Find where parenthesis are necessary
            //Store the values of the char comparisons to make the code more readable
            int cVal = (c.getInfo() instanceof Double) ? 0 : charCompare((Character) c.getInfo());
            int rVal = (c.getRight().getInfo() instanceof Double) ? 0 : charCompare((Character) c.getRight().getInfo());
            int lVal = (c.getLeft().getInfo() instanceof Double) ? 0 : charCompare((Character) c.getLeft().getInfo());
            return (cVal < 4 && (lVal > 0 || rVal > 0)) && (cVal > rVal && cVal > lVal) ?                           //determine if current node is higher priority than lower nodes and at least one lower node contains an operand
                    (lVal > 0 && rVal > 0) ?                                                                        //determine if children are both operands
                            "(" + getInfix(c.getLeft()) + ")" + c.getInfo() + "(" + getInfix(c.getRight()) + ")"    //put parenthesis around both children if both need them
                            : (lVal > 0) ?                                                                          //determine if left child is an operand
                            "(" + getInfix(c.getLeft()) + ")" + c.getInfo() + getInfix(c.getRight())                //put parenthesis around what left child will return
                            : getInfix(c.getLeft()) + c.getInfo() + "(" + getInfix(c.getRight()) + ")"              //else put parenthesis around what the right child returns
                    : getInfix(c.getLeft()) + c.getInfo() + getInfix(c.getRight());                         //else don't add parenthesis
        }

        if (c.getLeft() != null && c.getRight() == null)    //determine if node has only a left child
            return getInfix(c.getLeft()) + c.getInfo();     //return left child's infix before node's info
        if (c.getLeft() == null && c.getRight() != null) {  //determine if node has only a right child
            return c.getInfo() + getInfix(c.getRight());    //return node's info then right's infix
        }
        return c.getInfo() + "";    //otherwise return node's info
    }

    /**
     * Calls getPrefix on root
     *
     * @return String of prefix equation
     */
    public String getPrefix() {
        return getPrefix(head.getNext());
    }

    /**
     * PreOrder Traversal of tree
     *
     * @param c TwoChildNode to get prefix of
     * @return String prefix version of the equation with "[]" around each number/operand
     */
    private String getPrefix(TwoChildNode c) {
        if (c.getLeft() != null && c.getRight() != null)
            return "[" + c.getInfo() + "]" + getPrefix(c.getLeft()) + getPrefix(c.getRight());
        if (c.getLeft() != null && c.getRight() == null)
            return "[" + c.getInfo() + "]" + getPrefix(c.getLeft());
        if (c.getLeft() == null && c.getRight() != null) {
            return "[" + c.getInfo() + "]" + getPrefix(c.getRight());
        }
        return "[" + c.getInfo() + "]";
    }

    /**
     * Calls getPostfix on root
     *
     * @return String of postfix equation
     */
    public String getPostfix() {
        return getPostfix(head.getNext());
    }

    /**
     * PostOrder traversal of tree
     *
     * @param node TwoChildNode to get postfix of
     * @return String of postfix equation
     */
    private String getPostfix(TwoChildNode node) {
        if (node.getLeft() != null && node.getRight() != null)
            return getPostfix(node.getLeft()) + getPostfix(node.getRight()) + "[" + node.getInfo() + "]";
        if (node.getLeft() != null && node.getRight() == null)
            return getPostfix(node.getLeft()) + "[" + node.getInfo() + "]";
        if (node.getLeft() == null && node.getRight() != null)
            return getPostfix(node.getRight()) + "[" + node.getInfo() + "]";
        return "[" + node.getInfo() + "]";
    }


    /**
     * Calls deepestOperand on root
     *
     * @return TwoChildNode containing an operand deepest in the tree
     */
    private TwoChildNode deepestOperand() {
        return deepestOperand(head.getNext(), 0);
    }

    /**
     * Finds the deepest operand in the tree AKA first operand to execute
     *
     * @param node  TwoChildNode to find deepest point from
     * @param depth depth of the next node into the tree
     * @return TwoChildNode with operand deepest into the tree
     */
    private TwoChildNode deepestOperand(TwoChildNode node, int depth) {
        node.setDepth(depth); //sets node depth of current node
        if (node.getLeft() != null && node.getRight() != null) {                                                                                //determines if there are two children
            boolean leftIsOp = (node.getLeft().getInfo() instanceof Double) ? false : charCompare((Character) node.getLeft().getInfo()) > 0;    //boolean storing if left is an operator
            boolean rightIsOp = (node.getRight().getInfo() instanceof Double) ? false : charCompare((Character) node.getRight().getInfo()) > 0; //boolean storing if right is an operator

            return (leftIsOp && rightIsOp) ?                                                                                                    //determine if both are operators
                    (deepestOperand(node.getLeft(), depth + 1).getDepth() > deepestOperand(node.getRight(), depth + 1).getDepth()) ?            //determine if the left operator has deeper operands than the right operator
                            deepestOperand(node.getLeft(), depth + 1)                                                                           //if it's true it returns the left's deepest operand
                            : deepestOperand(node.getRight(), depth + 1)                                                                        //else it returns the right's deepest operand
                    : (leftIsOp) ?                                                                                                              //determines if left is an operator
                    deepestOperand(node.getLeft(), depth + 1)                                                                                   //returns deepest operator on the left
                    : (rightIsOp) ?                                                                                                             //determines if right is an operator
                    deepestOperand(node.getRight(), depth + 1)                                                                                  //returns deepest operator on the right
                    : node;                                                                                                                     //otherwise it returns current node
        } else if (node.getLeft() != null) {                                                                                    //determines if left is only valid child
            return (charCompare((Character) node.getLeft().getInfo()) > 0) ? deepestOperand(node.getLeft(), depth + 1) : node;  //returns deepest operand of the left if the left is an operand else returns current node
        } else if (node.getRight() != null) {
            return (charCompare((Character) node.getRight().getInfo()) > 0) ? deepestOperand(node.getRight(), depth + 1) : node;//same as that one but right side^
        } else                                                                                                                  //otherwise this has no children
            return node;                                                                                                        //return this node
    }

    /**
     * Calculates the given operands function on its children and sets the
     * original value of the node to the calculated value and deletes the
     * children from the tree
     *
     * @param operand TwoChildNode with two childless children
     */
    private void evaluate(TwoChildNode operand) {
        //determine function and how to operate on it
        if ((Character) operand.getInfo() == '-')
            operand.setInfo(Double.valueOf("" + operand.getLeft().getInfo()) - Double.valueOf("" + operand.getRight().getInfo()));
        else if ((Character) operand.getInfo() == '+')
            operand.setInfo(Double.valueOf("" + operand.getLeft().getInfo()) + Double.valueOf("" + operand.getRight().getInfo()));
        else if ((Character) operand.getInfo() == '/')
            operand.setInfo(Double.valueOf("" + operand.getLeft().getInfo()) / Double.valueOf("" + operand.getRight().getInfo()));
        else if ((Character) operand.getInfo() == '*')
            operand.setInfo(Double.valueOf("" + operand.getLeft().getInfo()) * Double.valueOf("" + operand.getRight().getInfo()));
        else if ((Character) operand.getInfo() == '^')
            operand.setInfo(Math.pow(Double.valueOf("" + operand.getLeft().getInfo()), Double.valueOf("" + operand.getRight().getInfo())));
        //delete children
        operand.setLeft(null);
        operand.setRight(null);
    }


    /**
     * Solves the expression
     * Calls simplify until tree cannot further be simplified
     */
    public void solve() {
        boolean simplified = true;
        while (simplified)
            simplified = simplify();
    }

    /**
     * Simplify the first thing that should be operated on in the equation following the rules of pemdas
     *
     * @return Boolean as it if it changed the tree at all
     */
    public boolean simplify() {
        if (head.getNext().getRight() == null || head.getNext().getLeft() == null)
            return false;
        evaluate(deepestOperand());
        return true;
    }

    /**
     * Decides priority of a character according loosely to PEMDAS
     *
     * @param c char to rate
     * @return highest if a parenthesis,
     * less if division or multiplication,
     * less if addition or subtraction,
     * least if a number (assuming no letters are passed in)
     */
    private int charCompare(char c) {
        return (c == ')') ? 5 : (c == '(') ? 4 : (c == '^') ? 3 : (c == '*' || c == '/') ? 2 : (c == '+' || c == '-') ? 1 : 0;
    }
}

/**
 * Used as the head of the tree, Nothing else
 */
class Head {
    private TwoChildNode next;

    /**
     * Empty Constructor
     */
    public Head() {

    }

    /**
     * Gets the first item in the tree
     *
     * @return TwoChildNode root of tree
     */
    public TwoChildNode getNext() {
        return next;
    }

    /**
     * Sets the root of tree
     *
     * @param next TwoChildNode to be the root
     */
    public void setNext(TwoChildNode next) {
        this.next = next;
    }
}
