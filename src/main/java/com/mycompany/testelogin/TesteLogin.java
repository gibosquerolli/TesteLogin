package com.mycompany.testelogin;

import javax.swing.JOptionPane;

public class TesteLogin {

    public static void main(String[] args) {
        String usuarioCadastrado = "";
        String senhaCadastrada = "";
        
        while (true) {
            String opcao = JOptionPane.showInputDialog(
                    "Digite um opção:\n1 - Cadastrar\n2 - Fazer Login\n3 - Sair");
            
            if (opcao == null || opcao.equals("3")){
                JOptionPane.showMessageDialog(null, "Programa encerrado.");
                break;
            }
            
            switch (opcao) {
                case "1" -> {
                    usuarioCadastrado = JOptionPane.showInputDialog("Digite seu usuário:");
                    senhaCadastrada = JOptionPane.showInputDialog("Digite sua senha:");
                    JOptionPane.showMessageDialog(null, "Cadastro reaizado com sucesso!");
                }
                case "2" -> {
                    String usuarioLogin = JOptionPane.showInputDialog("Digite seu usuário:");
                    String senhaLogin = JOptionPane.showInputDialog("Digite sua senha:");
                    if (usuarioLogin.equals(usuarioCadastrado)&& senhaLogin.equals(senhaCadastrada)){
                        JOptionPane.showMessageDialog(null, "Login bem-sucedido! Bem-vinco, " + usuarioLogin + "!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Usuário ou senha incorretos!");
                    }
                }
                default -> JOptionPane.showMessageDialog(null, "Opçãp inválida! Digite 1, 2 ou 3.");
            }
            }
        }
        
    }

