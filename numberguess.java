import javax.swing.JOptionPane;

public class numberguess {
    public static void main(String[] args) {
        String input;
        int number;
        input = JOptionPane.showInputDialog("Enter number");
        number = Integer.parseInt(input);
        int count = 1;
        int guess = (int) (Math.random() * 100 + 1);
        while (guess != number && count < 5) {
            if (guess < number) {
                JOptionPane.showMessageDialog(null, "Your guess is too high");
            } else if (guess > number) {
                JOptionPane.showMessageDialog(null, "Your guess is too low");
            }
            input = JOptionPane.showInputDialog("Enter number");
            number = Integer.parseInt(input);
            count++;
        }
        if (count == 5) {
            JOptionPane.showMessageDialog(null, "Your guess is wrong sorry. The number is  " + guess);
        } else {
            JOptionPane.showMessageDialog(null, "Your guess is correct");
        }
    }
}