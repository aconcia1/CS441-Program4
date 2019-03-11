package com.example.program4;

import android.graphics.Canvas;
import android.view.SurfaceHolder;

public class MainThread extends Thread {

    public static final int MAX_FPS = 30;
    private double averageFPS;
    private SurfaceHolder surfaceHolder;
    private GamePanel gamePanel;
    private boolean running;
    public static Canvas canvas;

    public MainThread(SurfaceHolder surfaceHolder, GamePanel gamePanel) {

        super();
        this.surfaceHolder = surfaceHolder;
        this.gamePanel = gamePanel;
    }

    public void run() {

        long startTime;
        long timeMillis = 1000/MAX_FPS;
        long waitTime;
        int frameCount = 0;
        long totalTime = 0;
        long targetTime = 1000/MAX_FPS;

        while(running) {

            startTime = System.nanoTime();
            canvas = null;

            try {

                canvas = this.surfaceHolder.lockCanvas();

                synchronized(surfaceHolder) {

                    this.gamePanel.update();
                    this.gamePanel.draw(canvas);
                }

            } catch(Exception e) {e.printStackTrace();}
        }
    }
}
