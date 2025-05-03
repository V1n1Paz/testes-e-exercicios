import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class ListaNomesGUI {
    private JFrame frame;
    private JTextField inputField;
    private JTextArea outputArea;
    private ArrayList<String> nomes;

    public ListaNomesGUI() {
        nomes = new ArrayList<>();

        // Janela principal
        frame = new JFrame("Lista de Nomes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(new BorderLayout());

        // Campo de entrada e botões
        inputField = new JTextField();
        JPanel inputPanel = new JPanel(new GridLayout(2, 1));
        inputPanel.add(inputField);

        JPanel buttonsPanel = new JPanel(new GridLayout(1, 5));
        JButton addButton = new JButton("Adicionar");
        JButton removeButton = new JButton("Remover");
        JButton listarButton = new JButton("Listar");
        JButton buscarButton = new JButton("Buscar");
        JButton sairButton = new JButton("Sair");

        buttonsPanel.add(addButton);
        buttonsPanel.add(removeButton);
        buttonsPanel.add(listarButton);
        buttonsPanel.add(buscarButton);
        buttonsPanel.add(sairButton);
        inputPanel.add(buttonsPanel);

        // Área de saída
        outputArea = new JTextArea();
        outputArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(outputArea);

        // Adiciona componentes à janela
        frame.add(inputPanel, BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER);

        // Ações dos botões
        addButton.addActionListener(e -> {
            String nome = inputField.getText().trim();
            if (nome.isEmpty()) return;
            if (nomes.contains(nome)) {
                outputArea.append("O nome já está na lista.\n");
            } else {
                nomes.add(nome);
                outputArea.append("Nome \"" + nome + "\" adicionado.\n");
            }
            inputField.setText("");
        });

        removeButton.addActionListener(e -> {
            String nome = inputField.getText().trim();
            if (nome.isEmpty()) return;
            if (nomes.remove(nome)) {
                outputArea.append("Nome \"" + nome + "\" removido.\n");
            } else {
                outputArea.append("O nome \"" + nome + "\" não foi encontrado.\n");
            }
            inputField.setText("");
        });

        listarButton.addActionListener(e -> {
            if (nomes.isEmpty()) {
                outputArea.append("A lista está vazia.\n");
            } else {
                outputArea.append("Lista de nomes:\n");
                for (int i = 0; i < nomes.size(); i++) {
                    outputArea.append((i + 1) + ". " + nomes.get(i) + "\n");
                }
            }
        });

        buscarButton.addActionListener(e -> {
            String nome = inputField.getText().trim();
            if (nome.isEmpty()) return;
            if (nomes.contains(nome)) {
                int index = nomes.indexOf(nome);
                outputArea.append("O nome \"" + nome + "\" está na posição " + index + ".\n");
            } else {
                outputArea.append("O nome \"" + nome + "\" não está na lista.\n");
            }
        });

        sairButton.addActionListener(e -> {
            int confirm = JOptionPane.showConfirmDialog(frame, "Você tem certeza que quer sair?", "Confirmação", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(frame, "Obrigado por usar o programa! :)");
                System.exit(0);
            }
        });

        // Exibe a janela
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // Executa na thread de UI
        SwingUtilities.invokeLater(ListaNomesGUI::new);
    }
}
