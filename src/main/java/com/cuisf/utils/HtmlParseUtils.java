package com.cuisf.utils;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.net.MalformedURLException;
import java.net.URL;

public class HtmlParseUtils {

    public static void main(String[] args) throws Exception {
        /*
        * 需要联网
        */

        String url = "https://www.baidu.com/s?wd=java";
        //解析网页  Jsoup 返回的Document 就是js页面对象
        Document document = Jsoup.parse(new URL(url), 30000);

        Element element = document.getElementById("1");

        Elements elements = element.getElementsByTag("h3");

        for (Element el : elements) {
            String href = el.getElementsByTag("a").eq(0).attr("href");
            System.out.println("------------"+href);
        }

    }
}
