
package horadosistema;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Date;
import java.util.Locale;


public class HoraDoSistema {

    public static void main(String[] args) {
        // TODO code application logic here
        Date data =  new Date();
        
        System.out.println("a hora do sistema eh..:");
        System.out.println(data.toString());
        
        Locale loc = Locale.getDefault();
        System.out.print("O idioma do sistema é");
        System.out.println(loc.getDisplayLanguage());
        
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        System.out.println("a resolução do seu sistema é..:" + d.width + "X" + d.height);
    }
    
}
