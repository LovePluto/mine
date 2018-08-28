package com.wyh.interesting;

import com.sun.javadoc.*;

import java.io.File;

public class Doc extends Doclet {

    public static boolean start(RootDoc root) {
        ClassDoc[] classes = root.classes();
        System.out.println("start");
        for (ClassDoc classDoc : classes) {
//            File file = new File(classDoc.name() + ".txt");
            System.out.println("class name = " + classDoc.name());
            System.out.println("class toString = " + classDoc.toString());
            System.out.println("class commentText = " + classDoc.commentText());
            System.out.println("class dimension = " + classDoc.dimension());
            System.out.println("class typeName = " + classDoc.typeName());
            System.out.println("class getRawCommentText = " + classDoc.getRawCommentText());
//            System.out.println("class getRawCommentText = " + classDoc.tags());
//            System.out.println("class qualifiedName = " + classDoc.qualifiedName());
//            paramTags(classDoc.typeParamTags());
//            annotations(classDoc.annotations());
//            tags(classDoc.tags());
            tags(classDoc.tags("aa"));

//            classDoc.a
//            for ()
        }
        return true;
    }

    public static void paramTags(ParamTag[] paramTags) {
        System.out.println("start paramTags");
        for (ParamTag paramTag : paramTags) {
            System.out.println("Param Tags parameterName =  " + paramTag.parameterName());
            System.out.println("Param Tags parameterComment = " + paramTag.parameterComment());
//            System.out.println("Param Tags parameterComment = " + paramTag.);
        }
    }

    public static void tags(Tag[] tags) {
        System.out.println("start tags");
        for (Tag tag : tags) {
            System.out.println("Tags name =  " + tag.name());
            System.out.println("Tags text = " + tag.text());
            System.out.println("Tags kind = " + tag.kind());
//            System.out.println("Param Tags parameterComment = " + paramTag.);
        }
    }

    public static void annotations(AnnotationDesc[] annotationDescs) {
        System.out.println("start annotations");
        for (AnnotationDesc annotationDesc : annotationDescs) {
            System.out.println("annotations annotationType =  " + annotationDesc.annotationType());
            System.out.println("annotations elementValues = " + annotationDesc.elementValues());
//            System.out.println("Param Tags parameterComment = " + paramTag.);
        }
    }


    public static void main(String[] args) throws Exception {
//        String[] docArgs =
//                new String[]{
//                        "-doclet", Standard.class.getName(), "src/main/java/com/wyh/interesting/DocletDemo.java"
//                };
//        com.sun.tools.javadoc.Main.execute(docArgs);

        File file = new File("src/main");
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getCanonicalPath());
    }

}
