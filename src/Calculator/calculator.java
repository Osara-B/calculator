package Calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class calculator {

    private JFrame myCalc;
    private JTextField textField;

    double first;
    double second;
    double result;
    String operation;
    String answer;


    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    calculator window = new calculator();
                    window.myCalc.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }


    public calculator() {
        initialize();
    }


    private void initialize() {
        myCalc = new JFrame();
        myCalc.setFont(new Font("Tahoma", Font.BOLD, 35));
        myCalc.setResizable(false);
        myCalc.setAlwaysOnTop(true);
        myCalc.setTitle("Calculator");
        myCalc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myCalc.setVisible(true);
        myCalc.setBounds(100, 100, 461, 516);

        textField = new JTextField();
        textField.setFont(new Font("Tahoma", Font.BOLD, 50));
        textField.setBounds(10, 22, 426, 62);
        textField.setAutoscrolls(false);
        textField.setAlignmentX(5.0f);
        textField.setColumns(10);

        JButton btnNewButton = new JButton("Del");
        btnNewButton.setBounds(10, 106, 99, 62);
        btnNewButton.setActionCommand("New Button");
        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 25));
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String str = null;
                if(textField.getText().length() > 0) {
                    StringBuilder sb = new StringBuilder(textField.getText());
                    sb.deleteCharAt(textField.getText().length()-1);
                    str = sb.toString();
                    textField.setText(str);
                }
            }
        });

        JButton btnNewButton_1 = new JButton("Clear");
        btnNewButton_1.setBounds(119, 106, 99, 62);
        btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 25));
        btnNewButton_1.setActionCommand("New Button");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(null);
            }
        });

        JButton btnNewButton_2 = new JButton("7");
        btnNewButton_2.setBounds(10, 179, 99, 62);
        btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 25));
        btnNewButton_2.setActionCommand("New Button");
        btnNewButton_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String number = textField.getText()+btnNewButton_2.getText();
                textField.setText(number);
            }
        });

        JButton btnNewButton_3 = new JButton("8");
        btnNewButton_3.setBounds(119, 179, 99, 62);
        btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 25));
        btnNewButton_3.setActionCommand("New Button");
        btnNewButton_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String number = textField.getText()+btnNewButton_3.getText();
                textField.setText(number);
            }
        });

        JButton btnNewButton_4 = new JButton("4");
        btnNewButton_4.setBounds(10, 252, 99, 62);
        btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 25));
        btnNewButton_4.setActionCommand("New Button");
        btnNewButton_4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String number = textField.getText()+btnNewButton_4.getText();
                textField.setText(number);
            }
        });

        JButton btnNewButton_5 = new JButton("5");
        btnNewButton_5.setBounds(119, 252, 99, 62);
        btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 25));
        btnNewButton_5.setActionCommand("New Button");

        btnNewButton_5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String number = textField.getText()+btnNewButton_5.getText();
                textField.setText(number);
            }
        });

        JButton btnNewButton_6 = new JButton("1");
        btnNewButton_6.setBounds(10, 325, 99, 62);
        btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 25));
        btnNewButton_6.setActionCommand("New Button");
        btnNewButton_6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String number = textField.getText()+btnNewButton_6.getText();
                textField.setText(number);
            }
        });

        JButton btnNewButton_7 = new JButton("2");
        btnNewButton_7.setBounds(119, 325, 99, 62);
        btnNewButton_7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String number = textField.getText()+btnNewButton_7.getText();
                textField.setText(number);
            }
        });
        btnNewButton_7.setFont(new Font("Tahoma", Font.BOLD, 25));
        btnNewButton_7.setActionCommand("New Button");

        JButton btnNewButton_8 = new JButton("00");
        btnNewButton_8.setBounds(228, 106, 99, 62);
        btnNewButton_8.setFont(new Font("Tahoma", Font.BOLD, 25));
        btnNewButton_8.setActionCommand("New Button");
        btnNewButton_8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String number = textField.getText()+btnNewButton_8.getText();
                textField.setText(number);
            }
        });

        JButton btnNewButton_9 = new JButton("9");
        btnNewButton_9.setBounds(228, 179, 99, 62);
        btnNewButton_9.setFont(new Font("Tahoma", Font.BOLD, 25));
        btnNewButton_9.setActionCommand("New Button");
        btnNewButton_9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String number = textField.getText()+btnNewButton_9.getText();
                textField.setText(number);
            }
        });

        JButton btnNewButton_10 = new JButton("6");
        btnNewButton_10.setBounds(228, 252, 99, 62);
        btnNewButton_10.setFont(new Font("Tahoma", Font.BOLD, 30));
        btnNewButton_10.setActionCommand("New Button");
        btnNewButton_10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String number = textField.getText()+btnNewButton_10.getText();
                textField.setText(number);
            }
        });

        JButton btnNewButton_11 = new JButton("3");
        btnNewButton_11.setBounds(228, 325, 99, 62);
        btnNewButton_11.setFont(new Font("Tahoma", Font.BOLD, 25));
        btnNewButton_11.setActionCommand("New Button");
        btnNewButton_11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String number = textField.getText()+btnNewButton_11.getText();
                textField.setText(number);
            }
        });

        JButton btnNewButton_12 = new JButton("+");
        btnNewButton_12.setBounds(337, 106, 99, 62);
        btnNewButton_12.setFont(new Font("Tahoma", Font.BOLD, 25));
        btnNewButton_12.setActionCommand("New Button");
        btnNewButton_12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                first = Double.parseDouble(textField.getText());
                textField.setText("");
                operation = "+";
            }
        });

        JButton btnNewButton_13 = new JButton("0");
        btnNewButton_13.setBounds(10, 398, 99, 62);
        btnNewButton_13.setFont(new Font("Tahoma", Font.BOLD, 25));
        btnNewButton_13.setActionCommand("New Button");
        btnNewButton_13.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String number = textField.getText()+btnNewButton_13.getText();
                textField.setText(number);
            }
        });

        JButton btnNewButton_14 = new JButton(".");
        btnNewButton_14.setBounds(119, 398, 99, 62);
        btnNewButton_14.setFont(new Font("Tahoma", Font.BOLD, 25));
        btnNewButton_14.setActionCommand("New Button");
        btnNewButton_14.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String number = textField.getText()+btnNewButton_14.getText();
                textField.setText(number);
            }
        });

        JButton btnNewButton_15 = new JButton("=");
        btnNewButton_15.setBounds(228, 398, 99, 62);
        btnNewButton_15.setFont(new Font("Tahoma", Font.BOLD, 25));
        btnNewButton_15.setActionCommand("New Button");
        btnNewButton_15.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String answer;
                second = Double.parseDouble(textField.getText());

                if(operation == "+") {
                    result = first + second;
                    answer = String.format("%.2f", result);
                    textField.setText(answer);
                } else if(operation == "-") {
                    result = first - second;
                    answer = String.format("%.2f", result);
                    textField.setText(answer);
                } else if(operation == "*") {
                    result = first * second;
                    answer = String.format("%.2f", result);
                    textField.setText(answer);
                } else if(operation == "/") {
                    result = first / second;
                    answer = String.format("%.2f", result);
                    textField.setText(answer);
                } else if(operation == "%") {
                    result = first % second;
                    answer = String.format("%.2f", result);
                    textField.setText(answer);
                }

            }
        });

        JButton btnNewButton_16 = new JButton("-");
        btnNewButton_16.setBounds(337, 179, 99, 62);
        btnNewButton_16.setFont(new Font("Tahoma", Font.BOLD, 25));
        btnNewButton_16.setActionCommand("New Button");
        btnNewButton_16.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                first = Double.parseDouble(textField.getText());
                textField.setText("");
                operation = "-";
            }
        });

        JButton btnNewButton_10_1 = new JButton("*");
        btnNewButton_10_1.setBounds(337, 252, 99, 62);
        btnNewButton_10_1.setFont(new Font("Tahoma", Font.BOLD, 25));
        btnNewButton_10_1.setActionCommand("New Button");
        btnNewButton_10_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                first = Double.parseDouble(textField.getText());
                textField.setText("");
                operation = "*";
            }
        });

        JButton btnNewButton_10_2 = new JButton("/");
        btnNewButton_10_2.setBounds(337, 325, 99, 62);
        btnNewButton_10_2.setFont(new Font("Tahoma", Font.BOLD, 25));
        btnNewButton_10_2.setActionCommand("New Button");
        btnNewButton_10_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                first = Double.parseDouble(textField.getText());
                textField.setText("");
                operation = "/";
            }
        });

        JButton btnNewButton_10_3 = new JButton("%");
        btnNewButton_10_3.setBounds(337, 398, 99, 62);
        btnNewButton_10_3.setFont(new Font("Tahoma", Font.BOLD, 25));
        btnNewButton_10_3.setActionCommand("New Button");
        btnNewButton_10_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                first = Double.parseDouble(textField.getText());
                textField.setText("");
                operation = "%";
            }
        });
        myCalc.getContentPane().setLayout(null);
        myCalc.getContentPane().add(textField);
        myCalc.getContentPane().add(btnNewButton);
        myCalc.getContentPane().add(btnNewButton_1);
        myCalc.getContentPane().add(btnNewButton_2);
        myCalc.getContentPane().add(btnNewButton_3);
        myCalc.getContentPane().add(btnNewButton_4);
        myCalc.getContentPane().add(btnNewButton_5);
        myCalc.getContentPane().add(btnNewButton_6);
        myCalc.getContentPane().add(btnNewButton_7);
        myCalc.getContentPane().add(btnNewButton_8);
        myCalc.getContentPane().add(btnNewButton_9);
        myCalc.getContentPane().add(btnNewButton_10);
        myCalc.getContentPane().add(btnNewButton_11);
        myCalc.getContentPane().add(btnNewButton_12);
        myCalc.getContentPane().add(btnNewButton_13);
        myCalc.getContentPane().add(btnNewButton_14);
        myCalc.getContentPane().add(btnNewButton_15);
        myCalc.getContentPane().add(btnNewButton_16);
        myCalc.getContentPane().add(btnNewButton_10_1);
        myCalc.getContentPane().add(btnNewButton_10_2);
        myCalc.getContentPane().add(btnNewButton_10_3);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(0, 0, 2, 2);
        myCalc.getContentPane().add(scrollPane);
    }
}