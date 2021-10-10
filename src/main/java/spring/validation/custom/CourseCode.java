package spring.validation.custom;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = CourseCodeConstraintValidator.class)
@Target({ ElementType.METHOD ,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {
    // define default Course code
    public String value() default "LUV";
    //define error message
    public String message() default "Must start with LUV";
    //define default group
    public Class<?>[] groups() default {};
    //define default payload
    public Class<? extends Payload>[] payload() default {};
}
