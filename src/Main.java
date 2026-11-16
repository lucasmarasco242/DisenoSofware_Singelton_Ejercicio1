//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Configuracion c1 = Configuracion.getInstancia();
        Configuracion c2 = Configuracion.getInstancia();

        System.out.println("¿Son la misma instancia?: " + (c1 == c2));
        System.out.println("Clave: " + c1.getClave());
        System.out.println("Valor: " + c2.getValor());
    }
}