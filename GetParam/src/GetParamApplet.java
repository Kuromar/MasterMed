import java.awt.*;
import java.applet.*;
// Создаем класс MyParameters
public class GetParamApplet extends Applet { 
   // Обьявляем переменные для приема параметров
   String  NameBox1 = new String();
   int     WidthBox1;
   long    AreaBox1;
   float   floatBox1;
   boolean activeBox1;
   // Прием параметров в методе start ()
   public void start () {
      String param = new String();
      // Прем первого - строкового параметра 
      NameBox1 = getParameter("NameBox");
      if (NameBox1 == null)
         NameBox1 = "Not Found";
      // Прем второго - параметра типа int
      // Функция parseInt переводит из строкового 
      // формата в целочисленный
      // Обработка исключительной ситуации 
      // связана с прерыванием, которое может
      // возникнуть в этой функции, 
      // когда перевод невозможен
      param = getParameter("WidthBox");
      try {
         if (param != null)
            WidthBox1 = Integer.parseInt(param);
         else
            WidthBox1 = 0;
      } catch (NumberFormatException e)
      { WidthBox1 = -1; }
      // Прем третьего - параметра типа long
      // Функция parseLong переводит из строкового 
      // формата в целочисленный
      param = getParameter("AreaBox");
      try {
         if (param != null)
            AreaBox1 = Long.parseLong(param);
         else
            AreaBox1 = 0;
      } catch (NumberFormatException e)
      { AreaBox1 = -1; }
      // Прем четвертого - параметра типа float
      // Функция valueOf переводит из строкового 
      // формата в формат с плавающей точкой
      param = getParameter("floatBox");
      try {
         if (param != null)
            floatBox1 = Float.parseFloat(param);
         else
            floatBox1 = 0;
      } catch (NumberFormatException e)
      { floatBox1 = -1; }
      // Прем пятого - параметра логического типа 
      param = getParameter("activeBox");
      if (param != null)
         activeBox1 = Boolean.parseBoolean(param);
   }
   // Вывод в апплет значений полученных
   // и преобразованных параметров
   public void paint (Graphics dr) {
      dr.drawString ("NameBox   : " + NameBox1   , 20, 20);
      dr.drawString ("WidthBox  : " + WidthBox1  , 20, 70);
      dr.drawString ("AreaBox   : " + AreaBox1   , 20, 120);
      dr.drawString ("floatBox  : " + floatBox1  , 20, 170);
      dr.drawString ("activeBox : " + activeBox1 , 20, 220);
   }
}