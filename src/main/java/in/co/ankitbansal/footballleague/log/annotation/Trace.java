package in.co.ankitbansal.footballleague.log.annotation;

import in.co.ankitbansal.footballleague.log.eventtype.LogEventType;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(value = {ElementType.METHOD})
public @interface Trace {
  LogEventType type() default LogEventType.SERVICE;
}
