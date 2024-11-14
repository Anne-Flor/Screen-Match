package Exceção;

public class ErrorDeConversaoAnoException extends RuntimeException {
    private String mensagem;

    public ErrorDeConversaoAnoException(String mensagem){
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
