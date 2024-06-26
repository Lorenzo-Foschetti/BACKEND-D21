package lorenzofoschetti.u5d8.exceptions;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
public class ErrorsPayload {

    private String errorMessage;

    private LocalDateTime errorTime;


}
