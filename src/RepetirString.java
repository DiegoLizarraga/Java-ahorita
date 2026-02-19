public class RepetirString {
    public static void main(String[] args) {
        String texto = "Hola ";
        int n = 5; // número de repeticiones

        // Usando un ciclo for
        String resultado = "";
        for (int i = 0; i < n; i++) {
            resultado += texto;
        }

        System.out.println("Resultado con for: " + resultado);

        // Usando StringBuilder (más eficiente)
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(texto);
        }

        System.out.println("Resultado con StringBuilder: " + sb.toString());
    }
}
