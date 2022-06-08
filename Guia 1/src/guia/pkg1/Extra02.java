
package guia.pkg1;

/**
 *
 * @author JuanJo.Martinez
 */
public class Extra02 {

    public static void main(String[] args) {
        
        //Extra 2
        /*Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a 
        cada una. A continuación, realizar las instrucciones necesarias para que: B tome el 
        valor de C, C tome el valor de A, A tome el valor de D y D tome el valor de B. 
        Mostrar los valores iniciales y los valores finales de cada variable. Utilizar sólo una 
        variable auxiliar.*/
        
        int A,B,C,D,aux;
        A = 5;
        B = 10;
        C = 15;
        D = 20;
        
        System.out.println("Los valores iniciales de las variables son:");
        System.out.println("A = "+A);
        System.out.println("B = "+B);
        System.out.println("C = "+C);
        System.out.println("D = "+D);
        System.out.println("Los valores cambiados serían los siguientes:");
        
        aux = C;
        B = aux;
        System.out.println("B = "+B);
        aux = A;
        C = aux;
        System.out.println("C = "+C);
        aux = D;
        A = aux;
        System.out.println("A = "+A);
        aux = 10;
        D = aux;
        System.out.println("D = "+D); 
        
    }
    
}
