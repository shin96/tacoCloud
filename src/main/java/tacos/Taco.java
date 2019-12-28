package tacos;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Data
public class Taco {

    @NotNull
    @Size(min = 5, message = "at least 5 character name should be there")
    private String name;

    @Size(min = 1, message = "minimum one ingredient is required")
    private List<String> ingredients;
}
