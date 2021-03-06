package per.nonlone.expandtweak.mybatis.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/**
 * MyBatis 自动数据池连接注解
 * @author Nonlone
 * @email thunderbird.shun@gmail.com
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface DataSource {
 public String value() default "";
}
