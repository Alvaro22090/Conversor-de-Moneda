public class ConversionMoneda {
    public void conversion(String moneda, String objetivo, double valor){
        ConsultaMoneda consulta = new ConsultaMoneda();
        InformacionMoneda informacion = consulta.buscarMoneda(moneda, objetivo, valor);
        System.out.println("EL valor " + valor +" [" + informacion.base_code() + "] corresponde al valor final de =>> "
                + informacion.conversion_result()+ " ["+ informacion.target_code()+ "]");
    }
}
