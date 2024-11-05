/*
 * Dialog Boxes
 * -to interact with users thru GUIs
 * - grabs the attention of the user
 * -contained in the javax.swing package
 * 
 * Using JOptionPane class 
 * contains the following static methods
 * 
 * //syntax and example of each
 * showMessageDialog() - displays information to the user
 * Syntax:
 * JOptionPane.showMessageDialog(parentComponent, message, title, messageType);
 * 
 * showConfirmDialog() - asks a question that requires a yes/no confirmation
 * Syntax:
 * int result = JOptionPane.showConfirmationDialog(parentComponent, message, title, optionType);
 * 
 * showInputDialog() - asks for user input
 * Syntax:
 * String input = JOptionPane.showInputDialog(parentComponent, message);
 * 
 * showOptionDialog - a combination of the three methods, gives you flexibilityby letting you customize
 * Syntax:
 * int result = JOptionPane.showOptionDialog(parentComponent, message, title, optionType, messageType, icon, options, initialValue);
 * 
 * 
 * //syntax and example of each
 * Types of Messages
 * INFORMATION_MESSAGE
 * displays an information icon and is used for informational messages
 * 
 * ERROR_MESSAGE
 * displays an error icon and is used to indicate an error or problem.
 * 
 * WARNING_MESSAGE
 * displays a warning icon and is used to give a cautionary message
 * 
 * QUESTION_MESSAGE
 * displays a question icon and is often used in showConfirmDialog() or showOptionDialog() when asking a question
 * 
 * PLAIN_MESSAGE
 * No icon displayed; it's used for plain messages without any special styling
 * 
 * 
 * JDialog Class
 * 
 * JFrame Class
 */

 import javax.swing.JOptionPane;

 public class DialogBoxes{
    public static void main(String[] args){
        /* 
        //showMessageDialog
        JOptionPane.showMessageDialog(null, "Operation completed successfully!", "Information", JOptionPane.INFORMATION_MESSAGE);

        //showConfirmDialog
        int result = JOptionPane.showConfirmDialog(null,"Are you sure you want to exit?","Exit Confirmation",JOptionPane.YES_NO_OPTION);

        //showInputDialog
        String name = JOptionPane.showInputDialog(null,"Enter your name: ");
        JOptionPane.showMessageDialog(null,"Welcome, " + name + "!");

        //showOptionDialog
        //int result = JOptionPane.showOptionDialog(parentComponent, messsage, title,optionType, messageType, icon,options, initialValue);

        Object[] options = {"Option 1","Option 2","Option 3"};
        int choice = JOptionPane.showOptionDialog(null,"Select an option: ","Custom Option Dialog",JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        JOptionPane.showMessageDialog(null,"You selected: " + options[choice]);
        
        */

        //INFORMATION_MESSAGE
        JOptionPane.showMessageDialog(null, "Process completed!", "Info", JOptionPane.INFORMATION_MESSAGE);

        //ERROR_MESSAGE
        JOptionPane.showMessageDialog(null, "Error Occurred!", "Error", JOptionPane.ERROR_MESSAGE);

        //WARNING_MESSAGE
        JOptionPane.showMessageDialog(null,"This action might get you in trouble!", "Warning!", JOptionPane.WARNING_MESSAGE);

        //QUESTION_MESSAGE
        //mainly used with showConfirmMessage() and showOptionDialog()
        JOptionPane.showConfirmDialog(null, "Did you know you have 30 minutes??!!", "30 MINS!!",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        //PLAIN_MESSAGE
        JOptionPane.showMessageDialog(null, "This is a plain message.", "Plain", JOptionPane.PLAIN_MESSAGE);
    }
 }