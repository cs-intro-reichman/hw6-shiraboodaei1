// Source code is decompiled from a .class file using FernFlower decompiler.
import java.awt.Color;

public class Editor4 {
   public Editor4() {
   }

   public static void main(String[] var0) {
      String var1 = var0[0];
      Color[][] var3 = Runigram.read(var1);
      Color[][] var4 = null;
      
      var4 = Runigram.grayScaled(var3);
      

      Runigram.setCanvas(var3);
      Runigram.display(var3);
      StdDraw.pause(3000);
      Runigram.display(var4);
   }
}
