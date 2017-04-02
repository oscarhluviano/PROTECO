public class CArr {
    public static void main(String[] args) {
        System.out.println();

        if (args.length < 3) {
            return;
        }

        String operador = args[0];
        double[] arr = new double[args.length - 1];

        try {
            for (int i = 0; i < arr.length; i++)
                arr[i] = Double.parseDouble(args[i+1]);
        } catch(NumberFormatException e) {
            System.out.println("\nEsa operacion no es valida\n");
            return;
        }

        double resultado = operar(operador, arr);
        System.out.println("Operacion: " + operador + " Resultado: " + resultado);
    }

    private static double operar(String operador, double[] arr) {
        double resultado = 0;

        switch (operador) {
            case "+":
                for (double d: arr)
                    resultado += d;
                break;
            case "-":
                for (double d: arr)
                    resultado -= d;
                break;
            case "x":
                resultado = 1;
                for (double d: arr)
                    resultado *= d;
                break;
            case "/":
                for (int i = 0; i < arr.length - 1; i++)
                    resultado += arr[i];
                double div = arr[arr.length -1];
                if (div == 0) {
                    System.out.println("Math error");
                    System.exit(-1);
                }
                resultado = resultado / div;
                break;
            default:
                System.out.println("\nEsa operacion no es valida");
                System.exit(-1);
        }
        return resultado;
    }

}