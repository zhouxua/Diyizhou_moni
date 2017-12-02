package com.example.dream.diyizhou_moni.bean;

import java.util.List;

/**
 * Created by dream on 2017/12/1.
 */

public class NewsBean {

    /**
     * code : 200
     * msg : success
     * newslist : [{"ctime":"2017-12-01 19:48","title":"【一线】美团点评宣布组织升级 王慧文任大零售事业群总裁","description":"腾讯科技","picUrl":"http://inews.gtimg.com/newsapp_ls/0/2394387652_300240/0","url":"http://tech.qq.com/a/20171201/029791.htm"},{"ctime":"2017-12-01 15:58","title":"iPhone X产能升级：国行版一周时间拿现货","description":"腾讯科技","picUrl":"http://inews.gtimg.com/newsapp_ls/0/2391990811_300240/0","url":"http://tech.qq.com/a/20171201/022839.htm"},{"ctime":"2017-12-01 16:30","title":"【一线】罗永浩：锤子做手机不赚钱，全靠配件和净化器","description":"腾讯科技","picUrl":"http://inews.gtimg.com/newsapp_ls/0/2392259636_300240/0","url":"http://tech.qq.com/a/20171201/023802.htm"},{"ctime":"2017-12-01 14:55","title":"黑客首次揭秘如何越狱iPhone X ：乔布斯的苹果终有缺口","description":"腾讯科技","picUrl":"http://inews.gtimg.com/newsapp_ls/0/2391568198_300240/0","url":"http://new.qq.com/omn/20171201A0EOZY.html"},{"ctime":"2017-12-01 10:34","title":"马云回应蚂蚁金服上市：还没做好准备","description":"腾讯科技","picUrl":"http://inews.gtimg.com/newsapp_ls/0/2390019392_300240/0","url":"http://tech.qq.com/a/20171201/013006.htm"},{"ctime":"2017-12-01 11:20","title":"【一线】消息称李一男内幕交易罪刑满 或于明日回归","description":"腾讯科技","picUrl":"http://inews.gtimg.com/newsapp_ls/0/2390392036_300240/0","url":"http://tech.qq.com/a/20171201/014880.htm"},{"ctime":"2017-12-01 10:34","title":"马云回应蚂蚁上市：还没做好准备","description":"腾讯科技","picUrl":"http://inews.gtimg.com/newsapp_ls/0/2390019392_300240/0","url":"http://tech.qq.com/a/20171201/013006.htm"},{"ctime":"2017-12-01 09:36","title":"360壳公司江南嘉捷开板结束18连涨停 累计涨幅超4倍","description":"腾讯科技","picUrl":"http://inews.gtimg.com/newsapp_ls/0/2389633429_300240/0","url":"http://tech.qq.com/a/20171201/010303.htm"},{"ctime":"2017-12-01 08:49","title":"比特币挖矿新姿势：特斯拉车主在后备箱装了一台矿机","description":"腾讯科技","picUrl":"http://inews.gtimg.com/newsapp_ls/0/2389392701_300240/0","url":"http://tech.qq.com/a/20171201/007811.htm"},{"ctime":"2017-12-01 09:32","title":"揭秘废弃手机拆解地下产业链：iPhone摄像头3块钱一个","description":"腾讯科技","picUrl":"http://inews.gtimg.com/newsapp_ls/0/2389617890_300240/0","url":"http://tech.qq.com/a/20171201/010062.htm"}]
     */

    private int code;
    private String msg;
    private List<NewslistBean> newslist;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<NewslistBean> getNewslist() {
        return newslist;
    }

    public void setNewslist(List<NewslistBean> newslist) {
        this.newslist = newslist;
    }

    public static class NewslistBean {
        /**
         * ctime : 2017-12-01 19:48
         * title : 【一线】美团点评宣布组织升级 王慧文任大零售事业群总裁
         * description : 腾讯科技
         * picUrl : http://inews.gtimg.com/newsapp_ls/0/2394387652_300240/0
         * url : http://tech.qq.com/a/20171201/029791.htm
         */

        private String ctime;
        private String title;
        private String description;
        private String picUrl;
        private String url;

        public String getCtime() {
            return ctime;
        }

        public void setCtime(String ctime) {
            this.ctime = ctime;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getPicUrl() {
            return picUrl;
        }

        public void setPicUrl(String picUrl) {
            this.picUrl = picUrl;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }
}
