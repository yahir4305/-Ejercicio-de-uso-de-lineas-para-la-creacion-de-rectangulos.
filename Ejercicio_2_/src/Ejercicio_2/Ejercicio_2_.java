package Ejercicio_2;

import com.sun.opengl.util.Animator;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.media.opengl.GL;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLCanvas;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.glu.GLU;
import javax.swing.JFrame;



public class Ejercicio_2_ implements GLEventListener {
static GLU glu;
static GL gl;
static JFrame frame;
static int largo = 20;
static int ancho = 10;

    public static void main(String[] args) {
        frame = new JFrame("Ejercicio #2");
        GLCanvas canvas = new GLCanvas();

        canvas.addGLEventListener(new Ejercicio_2_());
        frame.add(canvas);
        final Animator animator = new Animator(canvas);
        frame.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
              
                new Thread(new Runnable() {

                    public void run() {
                        animator.stop();
                        System.exit(0);
                    }
                }).start();
            }
        });
        frame.setLocationRelativeTo(null);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);
        animator.start();
    }

    public void init(GLAutoDrawable drawable) {
      glu = new GLU ();
      gl = drawable.getGL();
      gl. glClearColor(0, 0, 0, 1);
      gl.glMatrixMode(gl.GL_PROJECTION);
      glu.gluOrtho2D(-700, 700, -350, 350);
    }

    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
     
    }

    public void display(GLAutoDrawable drawable) {
      gl.glLineWidth(1);
      
      for(int i =0; i < frame.getHeight()/largo;i++){
            gl.glBegin(GL.GL_LINE_LOOP);
            gl.glColor3f(1.0f, 0.0f, 0.0f);
            gl.glVertex2d(largo*i,ancho*i);
            gl.glVertex2d(largo*-i,ancho*i);
            gl.glColor3f(0.0f, 1.0f, 1.0f);
            gl.glVertex2d(largo*-i,ancho*-i);
            gl.glVertex2d(largo*i,ancho*-i);
            gl.glEnd();
      }
        
            gl.glFlush();
    }
public void displayChanged(GLAutoDrawable drawable, boolean modeChanged, boolean deviceChanged){}
    
}

