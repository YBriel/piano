import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;

import javax.sound.sampled.*;
import javax.swing.JFrame;

/**
 * 使用说明
 * 1.解压声音资源类到E盘下面的piano文件夹下面
 * 2.运行Myframe即可
 * 3.按A-Z即可出声音
 */
public class MyFrame extends JFrame {

    /**
     * @param args
     */
    char charA;

    public MyFrame() {
        this.setSize(500, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("my piano");
        this.setVisible(true);
        this.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                char charA = e.getKeyChar();
                String s = String.valueOf(charA);
                System.out.println(s);
                String urlAddr = PianoSound.getUrlAddr(s);
                if(!urlAddr.equals("")){
                    try{
                        File file = new File(urlAddr);
                        AudioInputStream stream = AudioSystem.getAudioInputStream(file);
                        AudioFormat format = stream.getFormat();
                        DataLine.Info info = new DataLine.Info(Clip.class, format);
                        Clip clip = (Clip)AudioSystem.getLine(info);
                        clip.open(stream);
                        clip.start();
                    }catch(Exception e1){
                        e1.printStackTrace();
                    }
                }else {
                    System.out.println("按键无效");
                }
            }
        });


    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new MyFrame();
    }

}