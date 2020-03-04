import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.sound.sampled.*;
import javax.swing.JFrame;

/**
 * 使用说明
 * 1.解压声音资源类到E盘下面的piano文件夹下面
 * 2.运行Myframe即可
 * 3.按A-Z即可出声音
 */
public class MyFrame extends JFrame {

    private static List<String> copyList = new ArrayList<>();

    /**
     * @param args
     */
    char charA;


    private static void playSound(String urlAddr) {

        try {
            File file = new File(urlAddr);
            AudioInputStream stream = AudioSystem.getAudioInputStream(file);
            AudioFormat format = stream.getFormat();
            DataLine.Info info = new DataLine.Info(Clip.class, format);
            Clip clip = (Clip) AudioSystem.getLine(info);
            clip.open(stream);
            clip.start();
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e1) {
                e1.printStackTrace();
            }
        } catch (Exception e1) {
            e1.printStackTrace();
        }

    }

    private static void rePlay(List<String> list) {
     /*   String[] arr = {"w", "2", "f", "F", "2", "G", "W", "R", "5"};
        List<String> strings = Arrays.asList(arr);
        for (String string : strings) {
            playSound(string);
        }*/
        for (String s : list) {
            playSound(s);
        }
    }

    public MyFrame() {
        this.setSize(500, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("按=号重新播放");
        this.setVisible(true);
        this.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                char charA = e.getKeyChar();
                String s = String.valueOf(charA);
                String urlAddr = PianoSound.getUrlAddr(s);
                if (!urlAddr.equals("")) {
                    playSound(urlAddr);
                    copyList.add(urlAddr);
                    System.out.println(copyList);
                } else if (s.equals("=")) {
                    System.out.println(copyList);
                    rePlay(copyList);
                } else {
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