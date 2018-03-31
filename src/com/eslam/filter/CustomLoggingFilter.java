package com.eslam.filter;

//
//
//import java.io.*;
//import javax.servlet.ServletInputStream;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletRequestWrapper;
//import org.apache.log4j.Logger;
//
//public class CustomLoggingFilter extends HttpServletRequestWrapper  {
//
//
//	private static final Logger log = Logger.getLogger(LoggerFilter.class);
//    private final String body;
//
//	public CustomLoggingFilter(HttpServletRequest request) {
//		super(request);
//
//		StringBuilder stringBuilder = new StringBuilder();
//        BufferedReader bufferedReader = null;
//
//            InputStream inputStream;
//			try {
//				inputStream = request.getInputStream();
//
//            if (inputStream != null) {
//                bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
//                char[] charBuffer = new char[12];
//                int bytesRead = -1;
//                while ((bytesRead = bufferedReader.read(charBuffer)) > 0) {
//                    stringBuilder.append(charBuffer, 0, bytesRead);
//                }
//            } else {
//                stringBuilder.append("");
//        		log.debug("inputStream = : " +"null");
//        		log.info("inputStream = : " +"null");
//
//            }
//
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//        //Store request body content in 'body' variable
//        body = stringBuilder.toString();
//		System.out.println(body);
//		log.debug("body: " +body);
//		log.info("body: " +body);
//		log.info("Log: " + "doFilter method is finished");
//
//		// TODO Auto-generated constructor stub
//	}
//
//
//	/**
//     * Override of the getInputStream() method which returns an InputStream that reads from the
//     * stored XML body string instead of from the request's actual InputStream.
//     */
//    @Override
//    public ServletInputStream getInputStream ()
//        throws IOException {
//
//        final ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(body.getBytes());
//        ServletInputStream inputStream = new ServletInputStream() {
//            public int read ()
//                throws IOException {
//                return byteArrayInputStream.read();
//            }
//        };
//        return inputStream;
//    }
//
//
//}
