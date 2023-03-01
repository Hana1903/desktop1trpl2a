/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan2;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author lenovo
 */
public class LatihanForm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame j = new JFrame("Form Registrasi");
        
        JLabel namalengkap = new JLabel();
        namalengkap.setText("Nama Lengkap");
        namalengkap.setBounds(50, 100, 100, 30);
        j.add(namalengkap);
        
        JLabel nobp = new JLabel();
        nobp.setText("NoBP");
        nobp.setBounds(50, 140, 100, 30);
        j.add(nobp);
        
        JLabel username = new JLabel();
        username.setText("Username");
        username.setBounds(50, 180, 100, 30);
        j.add(username);
        
        JLabel password = new JLabel();
        password.setText("Password");
        password.setBounds(50, 220, 100, 30);
        j.add(password);
        
        JLabel jurusan = new JLabel();
        jurusan.setText("Jenis Jurusan");
        jurusan.setBounds(50, 260, 100, 30);
        j.add(jurusan);
        
        JLabel jeniskelamin = new JLabel();
        jeniskelamin.setText("Jenis Kelamin");
        jeniskelamin.setBounds(50, 300, 100, 30);
        j.add(jeniskelamin);
        
        JLabel email = new JLabel();
        email.setText("Email");
        email.setBounds(50, 340, 100, 30);
        j.add(email);
        
        JLabel nohp = new JLabel();
        nohp.setText("NoHp");
        nohp.setBounds(50, 380, 100, 30);
        j.add(nohp);
        
        JLabel alamat = new JLabel();
        alamat.setText("Alamat");
        alamat.setBounds(50, 420, 100, 30);
                
        
        JTextField namalengkapTxt = new JTextField();
        namalengkapTxt.setBounds(170, 100, 150, 25);
        j.add(namalengkapTxt);
        
        JTextField nobpTxt = new JTextField();
        nobpTxt.setBounds(170, 140, 150, 25);
        j.add(nobpTxt);
        
        JTextField usernameTxt = new JTextField();
        usernameTxt.setBounds(170, 180, 150, 25);
        j.add(usernameTxt);
        
        JTextField passwordTxt = new JTextField();
        passwordTxt.setBounds(170, 220, 150, 25);
        j.add(passwordTxt);
        
        String Jurusan[] = {"TI", "AN", "Electro", "Mesin", "BhsInggris"};
        JComboBox menuJurusan = new JComboBox(Jurusan);
        menuJurusan.setBounds(170, 260, 100, 30);
        j.add(menuJurusan);
        
        JRadioButton lk = new JRadioButton("Laki Laki", true);
        lk.setBounds(170, 300, 80, 30);
        j.add(lk);
        JRadioButton pr = new JRadioButton("Perempuan");
        pr.setBounds(250, 300, 150, 30);
        j.add(pr);
        
        JTextField emailTxt = new JTextField();
        emailTxt.setBounds(170, 340, 150, 25);
        j.add(emailTxt);
        
        JTextField nohpTxt = new JTextField();
        nohpTxt.setBounds(170, 380, 150, 25);
        j.add(nohpTxt);
        
        JTextArea alamatTxt =new JTextArea();
        alamatTxt.setBounds(170, 420, 150, 30);
        j.add(alamatTxt);
        
        JButton registrasiButton = new JButton();
        registrasiButton.setText("Registrasi");
        registrasiButton.setBounds(170, 470, 100, 50);
        j.add(registrasiButton);
        
        j.setSize(800, 800);
        j.setLayout(null);
        j.setVisible(true);
    }
    
}
