package com.book.thinkinginjava.annotation;

import javax.annotation.processing.Filer;
import javax.lang.model.element.*;
import javax.lang.model.type.TypeMirror;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.Attribute;
import javax.naming.directory.DirContext;
import javax.tools.FileObject;
import javax.tools.JavaFileManager;
import javax.tools.JavaFileObject;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.annotation.Annotation;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * @comments:
 * @author: binvy
 * @Date: 2018/7/29
 */
public class InterfaceExtractorProcessor implements AnnotationProcessor {
    private final AnnotationProcessorEnvironment env;
    private ArrayList<MethodDeclaration> interfaceMethods = new ArrayList<MethodDeclaration>();
    public InterfaceExtractorProcessor(AnnotationProcessorEnvironment env) {
        this.env = env;
    }
    public void process() {
        for (TypeDeclaration typeDecl : env.getSpecifiedTypeDeclaration()) {
            ExtractInTerface annot = typeDecl.getAnnotation(ExtractInTerface.class);
            if (annot == null) {
                break;
            }
            for ( MethodDeclaration m : typeDecl.getMethods
                   ) {
                if (m.getModifiers().contains(Modifier.PUBLIC) && !(m.getModifiers().contains(Modifier.STATIC))) {
                    interfaceMethods.add(m);
                }
            }
            if (interfaceMethods.size() > 0) {
                try {
                    PrintWriter writer = (PrintWriter) env.getFilter().createSourceFile(annot.value());
                    writer.println("package " + typeDecl.getPackage().getQualifiedName() + ":");
                    writer.println("public interface " + annot.value() + "{");
                    for ( MethodDeclaration m : interfaceMethods
                           ) {
                        writer.print(" public ");
                        writer.print(m.getReturnType() + " ");
                        writer.print(m.getSimpleName() + " ");
                        int i = 0;
                        for ( ParameterDeclaration param : m.getParameters()
                               ) {
                            writer.print(param.getType() + " " + param.getSimpleName());
                            if (++i < m.getParameters().size()) {
                                 writer.print(", ");
                            }
                        }
                        writer.println(");");
                    }
                    writer.println("}");
                    writer.flush();
                    writer.close();
                } catch (Exception e) {
                    System.out.println("");
                }
            }

        }
    }
}

interface AnnotationProcessor{}

class AnnotationProcessorEnvironment{
    public List<TypeDeclaration> getSpecifiedTypeDeclaration() {
        return new ArrayList<>();
    }

    public Filer getFilter() {
        return new Filer() {
            @Override
            public JavaFileObject createSourceFile(CharSequence name, Element... originatingElements) throws IOException {
                return null;
            }

            @Override
            public JavaFileObject createClassFile(CharSequence name, Element... originatingElements) throws IOException {
                return null;
            }

            @Override
            public FileObject createResource(JavaFileManager.Location location, CharSequence pkg, CharSequence relativeName, Element... originatingElements) throws IOException {
                return null;
            }

            @Override
            public FileObject getResource(JavaFileManager.Location location, CharSequence pkg, CharSequence relativeName) throws IOException {
                return null;
            }
        };
    }
}

class MethodDeclaration{
    public Attribute getModifiers() {
        return new Attribute() {
            @Override
            public NamingEnumeration<?> getAll() throws NamingException {
                return null;
            }

            @Override
            public Object get() throws NamingException {
                return null;
            }

            @Override
            public int size() {
                return 0;
            }

            @Override
            public String getID() {
                return null;
            }

            @Override
            public boolean contains(Object attrVal) {
                return false;
            }

            @Override
            public boolean add(Object attrVal) {
                return false;
            }

            @Override
            public boolean remove(Object attrval) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public DirContext getAttributeSyntaxDefinition() throws NamingException {
                return null;
            }

            @Override
            public DirContext getAttributeDefinition() throws NamingException {
                return null;
            }

            @Override
            public boolean isOrdered() {
                return false;
            }

            @Override
            public Object get(int ix) throws NamingException {
                return null;
            }

            @Override
            public Object remove(int ix) {
                return null;
            }

            @Override
            public void add(int ix, Object attrVal) {

            }

            @Override
            public Object set(int ix, Object attrVal) {
                return null;
            }

            @Override
            public Object clone() {
                return null;
            }
        };
    }

    public String getReturnType() {
        return "";
    }

    public String getSimpleName() {
        return "";
    }

    public List<ParameterDeclaration> getParameters() {
        return new ArrayList<>();
    }
}

class TypeDeclaration{

    public MethodDeclaration[] getMethods;

    public ExtractInTerface getAnnotation(Class<ExtractInTerface> extractInTerfaceClass) {
        return (ExtractInTerface) new InterfaceExtractorProcessor(new AnnotationProcessorEnvironment());
    }

    public QualifiedNameable getPackage() {
        return new QualifiedNameable() {
            @Override
            public Name getQualifiedName() {

                return new Name() {
                    @Override
                    public int length() {
                        return 0;
                    }

                    @Override
                    public char charAt(int index) {
                        return 0;
                    }

                    @Override
                    public CharSequence subSequence(int start, int end) {
                        return null;
                    }

                    @Override
                    public String toString() {
                        return null;
                    }

                    @Override
                    public boolean equals(Object obj) {
                        return false;
                    }

                    @Override
                    public int hashCode() {
                        return 0;
                    }

                    @Override
                    public boolean contentEquals(CharSequence cs) {
                        return false;
                    }
                };
            }

            @Override
            public TypeMirror asType() {
                return null;
            }

            @Override
            public ElementKind getKind() {
                return null;
            }

            @Override
            public List<? extends AnnotationMirror> getAnnotationMirrors() {
                return null;
            }

            @Override
            public <A extends Annotation> A getAnnotation(Class<A> annotationType) {
                return null;
            }

            @Override
            public Set<javax.lang.model.element.Modifier> getModifiers() {
                return null;
            }

            @Override
            public Name getSimpleName() {
                return null;
            }

            @Override
            public Element getEnclosingElement() {
                return null;
            }

            @Override
            public List<? extends Element> getEnclosedElements() {
                return null;
            }

            @Override
            public <R, P> R accept(ElementVisitor<R, P> v, P p) {
                return null;
            }
        };
    }
}

class ParameterDeclaration {
    public String getType() {
        return "paramType";
    }

    public String getSimpleName() {
        return "paramName";
    }
}