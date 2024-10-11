//package cc.openhome;

public class TextBlock {
    public static void main(String[] args) {
        String html = 
            """
            <!DOCTYPE html>
            <html lang="zh-tw">
            <head>
                <title>%s</title>
            </head>
            <body>
                %s
            </html>
            """;

        //String html = 
            
        //    "<!DOCTYPE html>\n"
        //    +"<html lang=\"zh-tw\">\n"
        //    +"<head>\n"
        //    +"    <title>Java Tutorial</title>\n"
        //    +"</head>\n"
        //    +"<body>\n"
        //    +"    <b>Hello, World</b>\n"
        //    +"</html>\n"
        //    ;
        
    	String title = "Java Tutorial";
    	String content = "<b>Hello, World</b>";
    	
        System.out.println(html.formatted(title, content));
    }
}
