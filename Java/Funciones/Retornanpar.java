class RetornonoParametro{

    // Método que no recibe parámetros y retorna un Dato
    public int obtenerNumero() {
        int numero = 756; 
        return numero;
    }

    public static void main(String[] args) {
        RetornonoParametro objeto = new RetornonoParametro();
        int resultado = objeto.obtenerNumero();
        System.out.println("El numero obtenido es: " + resultado);
    }
}

