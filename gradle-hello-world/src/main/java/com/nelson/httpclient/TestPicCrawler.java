//package com.nelson.httpclient;
//
//import com.cv4j.piccrawler.PicCrawlerClient;
//import com.cv4j.piccrawler.download.strategy.FileGenType;
//import com.cv4j.piccrawler.download.strategy.FileStrategy;
//
///**
// * Created by tony on 2017/10/16.
// */
//public class TestPicCrawler {
//
//    public static void main(String[] args) {
//
//        String url = "http://www.designerspics.com/"; // 针对某一个网址
//        PicCrawlerClient.get()
//                .timeOut(6000)
//                .fileStrategy(new FileStrategy() {
//
//                    @Override
//                    public String filePath() {
//                        return "temp";
//                    }
//
//                    @Override
//                    public String picFormat() {
//                        return "png";
//                    }
//
//                    @Override
//                    public FileGenType genType() {
//
//                        return FileGenType.AUTO_INCREMENT;
//                    }
//                })
//                .downloadWebPageImages(url);
//    }
//}
