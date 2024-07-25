package br.com.tt.user.dto;

import br.com.tt.user.exception.ErrorCode;
import br.com.tt.user.exception.InvalidParameterException;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;

import java.math.BigInteger;
import java.util.UUID;

@Getter
public class User {

    @JsonIgnore
    private BigInteger id;

    private UUID externalId;
    private String username;
    private String password;

    public User(BigInteger id, UUID externalId, String username, String password) {
        setId(id);
        setExternalId(externalId);
        setUsername(username);
        setPassword(password);
    }

    private void setId(BigInteger id) {
        if(id == null) throw new InvalidParameterException(ErrorCode.INVALID_ID);
        this.id = id;
    }

    private void setExternalId(UUID externalId) {
        if(externalId == null) throw new InvalidParameterException(ErrorCode.INVALID_EXTERNAL_ID);
        this.externalId = externalId;
    }

    private void setUsername(String username) {
        if(username == null) throw new InvalidParameterException(ErrorCode.INVALID_USERNAME);
        this.username = username;
    }

    private void setPassword(String password) {
        if(password == null) throw new InvalidParameterException(ErrorCode.INVALID_PASSWORD);
        this.password = password;
    }
}
