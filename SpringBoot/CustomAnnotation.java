import java.lang.annotation.*;

// 1.Create a new Java interface for your custom annotation:
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface CustomAnnotation {
    String value();
}

// In this example, the CustomAnnotation interface is defined
// with a single attribute named value.


// 2.Use the custom annotation in a Spring Boot component, such as a controller:
// @RestController
// public class MyController {

// @GetMapping("/")
// @CustomAnnotation("Hello World!")
// public String hello() {
// return "Hello World!";
// }
// }

// The @CustomAnnotation annotation is used on the hello() method to apply the custom
// annotation to the method.

// 3.Create a Spring Boot aspect to intercept and process the custom annotation:
// @Aspect
// @Component
// public class CustomAnnotationAspect {

// @Around("@annotation(com.example.CustomAnnotation)")
// public Object processCustomAnnotation(ProceedingJoinPoint joinPoint) throws Throwable {
// MethodSignature signature = (MethodSignature) joinPoint.getSignature();
// CustomAnnotation annotation = signature.getMethod().getAnnotation(CustomAnnotation.class);
// String message = annotation.value();
// System.out.println("CustomAnnotationAspect: " + message);
// return joinPoint.proceed();
// }
// }

// The CustomAnnotationAspect class is an aspect that intercepts methods annotated with
// @CustomAnnotation.
// In this example, the aspect retrieves the value of the CustomAnnotation and prints it to the
// console.
