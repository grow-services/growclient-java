package nl.topicuszorg.growclient.client;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.ws.rs.NameBinding;
import javax.ws.rs.ext.Provider;

/**
 * Annotation to define a method is a XML API call
 * 
 * @author Dries Schulten
 */
@Target({ ElementType.METHOD, ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
@NameBinding
@Provider
public @interface XmlApiMethod
{
}
