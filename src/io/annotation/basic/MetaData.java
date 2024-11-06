package io.annotation.basic;


@AnnoMeta
public class MetaData {

//    @AnnoMeta 필드에다가 선언하면 컴파일 에러발생함
    private String id;

    @AnnoMeta // 메서드 적용은 에러안낭모
    public void call() {

    }

    public static void main(String[] args) throws NoSuchMethodException {
        AnnoMeta typeAnno = MetaData.class.getAnnotation(AnnoMeta.class);

        System.out.println("typeAnno = " + typeAnno);

        AnnoMeta methodAnno = MetaData.class.getMethod("call").getAnnotation(AnnoMeta.class);
        System.out.println("methodAnno = " + methodAnno);
    }
}
