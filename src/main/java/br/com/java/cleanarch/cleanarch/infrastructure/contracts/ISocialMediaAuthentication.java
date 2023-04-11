package br.com.java.cleanarch.cleanarch.infrastructure.contracts;

public interface ISocialMediaAuthentication {
    public void loadUserByToken(String token);

}
