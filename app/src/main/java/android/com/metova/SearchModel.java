package android.com.metova;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class SearchModel {


    /**
     * DefinitionSource :
     * Heading : Android
     * ImageWidth : 0
     * RelatedTopics : [{"Result":"<a href=\"https://duckduckgo.com/Android_(operating_system)\">Android (operating system)<\/a>A mobile operating system currently developed by Google, based on the Linux kernel and designed...","Icon":{"URL":"https://duckduckgo.com/i/20c62706.png","Height":"","Width":""},"FirstURL":"https://duckduckgo.com/Android_(operating_system)","Text":"Android (operating system)A mobile operating system currently developed by Google, based on the Linux kernel and designed..."},{"Result":"<a href=\"https://duckduckgo.com/Android_(robot)\">Android (robot)<\/a>A robot or synthetic organism designed to look and act like a human, especially one with a body...","Icon":{"URL":"https://duckduckgo.com/i/7f935c8d.jpg","Height":"","Width":""},"FirstURL":"https://duckduckgo.com/Android_(robot)","Text":"Android (robot)A robot or synthetic organism designed to look and act like a human, especially one with a body..."},{"Result":"<a href=\"https://duckduckgo.com/Android_(film)\">Android (film)<\/a>A 1982 American science fiction film directed by Aaron Lipstadt and starring Don Keith Opper and...","Icon":{"URL":"https://duckduckgo.com/i/5e16843b.jpg","Height":"","Width":""},"FirstURL":"https://duckduckgo.com/Android_(film)","Text":"Android (film)A 1982 American science fiction film directed by Aaron Lipstadt and starring Don Keith Opper and..."},{"Result":"<a href=\"https://duckduckgo.com/Android_(board_game)\">Android (board game)<\/a>An adventure board game designed by Kevin Wilson and Dan Clark, published in 2008 by Fantasy...","Icon":{"URL":"","Height":"","Width":""},"FirstURL":"https://duckduckgo.com/Android_(board_game)","Text":"Android (board game)An adventure board game designed by Kevin Wilson and Dan Clark, published in 2008 by Fantasy..."},{"Result":"<a href=\"https://duckduckgo.com/Android_(TVXQ_song)\">\"Android\" (TVXQ song)<\/a>The 35th Japanese single by South Korean pop duo Tohoshinki.","Icon":{"URL":"https://duckduckgo.com/i/69314fa1.png","Height":"","Width":""},"FirstURL":"https://duckduckgo.com/Android_(TVXQ_song)","Text":"\"Android\" (TVXQ song)The 35th Japanese single by South Korean pop duo Tohoshinki."},{"Result":"<a href=\"https://duckduckgo.com/Methyltestosterone\">Methyltestosterone<\/a>A 17-alpha-alkylated anabolic steroid used to treat males with a testosterone deficiency.","Icon":{"URL":"https://duckduckgo.com/i/cd5854c8.png","Height":"","Width":""},"FirstURL":"https://duckduckgo.com/Methyltestosterone","Text":"MethyltestosteroneA 17-alpha-alkylated anabolic steroid used to treat males with a testosterone deficiency."},{"Topics":[{"Result":"<a href=\"https://duckduckgo.com/The_Androids\">The Androids<\/a>A rock band from Australia.","Icon":{"URL":"","Height":"","Width":""},"FirstURL":"https://duckduckgo.com/The_Androids","Text":"The AndroidsA rock band from Australia."},{"Result":"<a href=\"https://duckduckgo.com/d/Droid\">Droid Meanings<\/a>  See related meanings for the word 'Droid'.","Icon":{"URL":"","Height":"","Width":""},"FirstURL":"https://duckduckgo.com/d/Droid","Text":"Droid Meanings  See related meanings for the word 'Droid'."}],"Name":"See also"}]
     * Entity :
     * meta : {"perl_module":"DDG::Fathead::Wikipedia","status":"live","dev_date":null,"js_callback_name":"wikipedia","signal_from":"wikipedia_fathead","live_date":null,"src_options":{"skip_end":"0","skip_abstract":0,"skip_qr":"","language":"en","skip_icon":0,"skip_image_name":0,"directory":"","min_abstract_length":"20","skip_abstract_paren":0,"is_wikipedia":1,"source_skip":"","is_fanon":0,"is_mediawiki":1,"src_info":""},"repo":"fathead","src_id":1,"developer":[{"name":"DDG Team","url":"http://www.duckduckhack.com","type":"ddg"}],"tab":"About","producer":null,"id":"wikipedia_fathead","dev_milestone":"live","topic":["productivity"],"attribution":null,"name":"Wikipedia","example_query":"nicola tesla","created_date":null,"is_stackexchange":null,"description":"Wikipedia","designer":null,"src_domain":"en.wikipedia.org","src_name":"Wikipedia"}
     * Type : D
     * Redirect :
     * DefinitionURL :
     * AbstractURL : https://en.wikipedia.org/wiki/Android
     * Definition :
     * AbstractSource : Wikipedia
     * Infobox :
     * Image :
     * ImageIsLogo : 0
     * Abstract :
     * AbstractText :
     * AnswerType :
     * ImageHeight : 0
     * Answer :
     * Results : []
     */

    private String DefinitionSource;
    private String Heading;
    private String ImageWidth;
    private String Entity;
    /**
     * perl_module : DDG::Fathead::Wikipedia
     * status : live
     * dev_date : null
     * js_callback_name : wikipedia
     * signal_from : wikipedia_fathead
     * live_date : null
     * src_options : {"skip_end":"0","skip_abstract":0,"skip_qr":"","language":"en","skip_icon":0,"skip_image_name":0,"directory":"","min_abstract_length":"20","skip_abstract_paren":0,"is_wikipedia":1,"source_skip":"","is_fanon":0,"is_mediawiki":1,"src_info":""}
     * repo : fathead
     * src_id : 1
     * developer : [{"name":"DDG Team","url":"http://www.duckduckhack.com","type":"ddg"}]
     * tab : About
     * producer : null
     * id : wikipedia_fathead
     * dev_milestone : live
     * topic : ["productivity"]
     * attribution : null
     * name : Wikipedia
     * example_query : nicola tesla
     * created_date : null
     * is_stackexchange : null
     * description : Wikipedia
     * designer : null
     * src_domain : en.wikipedia.org
     * src_name : Wikipedia
     */

    private MetaEntity meta;
    private String Type;
    private String Redirect;
    private String DefinitionURL;
    private String AbstractURL;
    private String Definition;
    private String AbstractSource;
    private String Infobox;
    private String Image;
    private String ImageIsLogo;
    private String Abstract;
    private String AbstractText;
    private String AnswerType;
    private String ImageHeight;
    private String Answer;
    /**
     * Result : <a href="https://duckduckgo.com/Android_(operating_system)">Android (operating system)</a>A mobile operating system currently developed by Google, based on the Linux kernel and designed...
     * Icon : {"URL":"https://duckduckgo.com/i/20c62706.png","Height":"","Width":""}
     * FirstURL : https://duckduckgo.com/Android_(operating_system)
     * Text : Android (operating system)A mobile operating system currently developed by Google, based on the Linux kernel and designed...
     */

    private List<RelatedTopicsEntity> RelatedTopics = new ArrayList<>();
    private List<?> Results;

    public static SearchModel objectFromData(String str) {

        return new Gson().fromJson(str, SearchModel.class);
    }

    public void setDefinitionSource(String DefinitionSource) {
        this.DefinitionSource = DefinitionSource;
    }

    public void setHeading(String Heading) {
        this.Heading = Heading;
    }

    public void setImageWidth(String ImageWidth) {
        this.ImageWidth = ImageWidth;
    }

    public void setEntity(String Entity) {
        this.Entity = Entity;
    }

    public void setMeta(MetaEntity meta) {
        this.meta = meta;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public void setRedirect(String Redirect) {
        this.Redirect = Redirect;
    }

    public void setDefinitionURL(String DefinitionURL) {
        this.DefinitionURL = DefinitionURL;
    }

    public void setAbstractURL(String AbstractURL) {
        this.AbstractURL = AbstractURL;
    }

    public void setDefinition(String Definition) {
        this.Definition = Definition;
    }

    public void setAbstractSource(String AbstractSource) {
        this.AbstractSource = AbstractSource;
    }

    public void setInfobox(String Infobox) {
        this.Infobox = Infobox;
    }

    public void setImage(String Image) {
        this.Image = Image;
    }

    public void setImageIsLogo(String ImageIsLogo) {
        this.ImageIsLogo = ImageIsLogo;
    }

    public void setAbstract(String Abstract) {
        this.Abstract = Abstract;
    }

    public void setAbstractText(String AbstractText) {
        this.AbstractText = AbstractText;
    }

    public void setAnswerType(String AnswerType) {
        this.AnswerType = AnswerType;
    }

    public void setImageHeight(String ImageHeight) {
        this.ImageHeight = ImageHeight;
    }

    public void setAnswer(String Answer) {
        this.Answer = Answer;
    }

    public void setRelatedTopics(List<RelatedTopicsEntity> RelatedTopics) {
        this.RelatedTopics = RelatedTopics;
    }

    public void setResults(List<?> Results) {
        this.Results = Results;
    }

    public String getDefinitionSource() {
        return DefinitionSource;
    }

    public String getHeading() {
        return Heading;
    }

    public String getImageWidth() {
        return ImageWidth;
    }

    public String getEntity() {
        return Entity;
    }

    public MetaEntity getMeta() {
        return meta;
    }

    public String getType() {
        return Type;
    }

    public String getRedirect() {
        return Redirect;
    }

    public String getDefinitionURL() {
        return DefinitionURL;
    }

    public String getAbstractURL() {
        return AbstractURL;
    }

    public String getDefinition() {
        return Definition;
    }

    public String getAbstractSource() {
        return AbstractSource;
    }

    public String getInfobox() {
        return Infobox;
    }

    public String getImage() {
        return Image;
    }

    public String getImageIsLogo() {
        return ImageIsLogo;
    }

    public String getAbstract() {
        return Abstract;
    }

    public String getAbstractText() {
        return AbstractText;
    }

    public String getAnswerType() {
        return AnswerType;
    }

    public String getImageHeight() {
        return ImageHeight;
    }

    public String getAnswer() {
        return Answer;
    }



    public List<RelatedTopicsEntity> getRelatedTopics() {
        return RelatedTopics;
    }

    public List<?> getResults() {
        return Results;
    }

    public static class MetaEntity {
        private String perl_module;
        private String status;
        private Object dev_date;
        private String js_callback_name;
        private String signal_from;
        private Object live_date;
        /**
         * skip_end : 0
         * skip_abstract : 0
         * skip_qr :
         * language : en
         * skip_icon : 0
         * skip_image_name : 0
         * directory :
         * min_abstract_length : 20
         * skip_abstract_paren : 0
         * is_wikipedia : 1
         * source_skip :
         * is_fanon : 0
         * is_mediawiki : 1
         * src_info :
         */

        private SrcOptionsEntity src_options;
        private String repo;
        private int src_id;
        private String tab;
        private Object producer;
        private String id;
        private String dev_milestone;
        private Object attribution;
        private String name;
        private String example_query;
        private Object created_date;
        private Object is_stackexchange;
        private String description;
        private Object designer;
        private String src_domain;
        private String src_name;
        /**
         * name : DDG Team
         * url : http://www.duckduckhack.com
         * type : ddg
         */

        private List<DeveloperEntity> developer;
        private List<String> topic;

        public static MetaEntity objectFromData(String str) {

            return new Gson().fromJson(str, MetaEntity.class);
        }

        public void setPerl_module(String perl_module) {
            this.perl_module = perl_module;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public void setDev_date(Object dev_date) {
            this.dev_date = dev_date;
        }

        public void setJs_callback_name(String js_callback_name) {
            this.js_callback_name = js_callback_name;
        }

        public void setSignal_from(String signal_from) {
            this.signal_from = signal_from;
        }

        public void setLive_date(Object live_date) {
            this.live_date = live_date;
        }

        public void setSrc_options(SrcOptionsEntity src_options) {
            this.src_options = src_options;
        }

        public void setRepo(String repo) {
            this.repo = repo;
        }

        public void setSrc_id(int src_id) {
            this.src_id = src_id;
        }

        public void setTab(String tab) {
            this.tab = tab;
        }

        public void setProducer(Object producer) {
            this.producer = producer;
        }

        public void setId(String id) {
            this.id = id;
        }

        public void setDev_milestone(String dev_milestone) {
            this.dev_milestone = dev_milestone;
        }

        public void setAttribution(Object attribution) {
            this.attribution = attribution;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setExample_query(String example_query) {
            this.example_query = example_query;
        }

        public void setCreated_date(Object created_date) {
            this.created_date = created_date;
        }

        public void setIs_stackexchange(Object is_stackexchange) {
            this.is_stackexchange = is_stackexchange;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public void setDesigner(Object designer) {
            this.designer = designer;
        }

        public void setSrc_domain(String src_domain) {
            this.src_domain = src_domain;
        }

        public void setSrc_name(String src_name) {
            this.src_name = src_name;
        }

        public void setDeveloper(List<DeveloperEntity> developer) {
            this.developer = developer;
        }

        public void setTopic(List<String> topic) {
            this.topic = topic;
        }

        public String getPerl_module() {
            return perl_module;
        }

        public String getStatus() {
            return status;
        }

        public Object getDev_date() {
            return dev_date;
        }

        public String getJs_callback_name() {
            return js_callback_name;
        }

        public String getSignal_from() {
            return signal_from;
        }

        public Object getLive_date() {
            return live_date;
        }

        public SrcOptionsEntity getSrc_options() {
            return src_options;
        }

        public String getRepo() {
            return repo;
        }

        public int getSrc_id() {
            return src_id;
        }

        public String getTab() {
            return tab;
        }

        public Object getProducer() {
            return producer;
        }

        public String getId() {
            return id;
        }

        public String getDev_milestone() {
            return dev_milestone;
        }

        public Object getAttribution() {
            return attribution;
        }

        public String getName() {
            return name;
        }

        public String getExample_query() {
            return example_query;
        }

        public Object getCreated_date() {
            return created_date;
        }

        public Object getIs_stackexchange() {
            return is_stackexchange;
        }

        public String getDescription() {
            return description;
        }

        public Object getDesigner() {
            return designer;
        }

        public String getSrc_domain() {
            return src_domain;
        }

        public String getSrc_name() {
            return src_name;
        }

        public List<DeveloperEntity> getDeveloper() {
            return developer;
        }

        public List<String> getTopic() {
            return topic;
        }

        public static class SrcOptionsEntity {
            private String skip_end;
            private int skip_abstract;
            private String skip_qr;
            private String language;
            private int skip_icon;
            private int skip_image_name;
            private String directory;
            private String min_abstract_length;
            private int skip_abstract_paren;
            private int is_wikipedia;
            private String source_skip;
            private int is_fanon;
            private int is_mediawiki;
            private String src_info;

            public static SrcOptionsEntity objectFromData(String str) {

                return new Gson().fromJson(str, SrcOptionsEntity.class);
            }

            public void setSkip_end(String skip_end) {
                this.skip_end = skip_end;
            }

            public void setSkip_abstract(int skip_abstract) {
                this.skip_abstract = skip_abstract;
            }

            public void setSkip_qr(String skip_qr) {
                this.skip_qr = skip_qr;
            }

            public void setLanguage(String language) {
                this.language = language;
            }

            public void setSkip_icon(int skip_icon) {
                this.skip_icon = skip_icon;
            }

            public void setSkip_image_name(int skip_image_name) {
                this.skip_image_name = skip_image_name;
            }

            public void setDirectory(String directory) {
                this.directory = directory;
            }

            public void setMin_abstract_length(String min_abstract_length) {
                this.min_abstract_length = min_abstract_length;
            }

            public void setSkip_abstract_paren(int skip_abstract_paren) {
                this.skip_abstract_paren = skip_abstract_paren;
            }

            public void setIs_wikipedia(int is_wikipedia) {
                this.is_wikipedia = is_wikipedia;
            }

            public void setSource_skip(String source_skip) {
                this.source_skip = source_skip;
            }

            public void setIs_fanon(int is_fanon) {
                this.is_fanon = is_fanon;
            }

            public void setIs_mediawiki(int is_mediawiki) {
                this.is_mediawiki = is_mediawiki;
            }

            public void setSrc_info(String src_info) {
                this.src_info = src_info;
            }

            public String getSkip_end() {
                return skip_end;
            }

            public int getSkip_abstract() {
                return skip_abstract;
            }

            public String getSkip_qr() {
                return skip_qr;
            }

            public String getLanguage() {
                return language;
            }

            public int getSkip_icon() {
                return skip_icon;
            }

            public int getSkip_image_name() {
                return skip_image_name;
            }

            public String getDirectory() {
                return directory;
            }

            public String getMin_abstract_length() {
                return min_abstract_length;
            }

            public int getSkip_abstract_paren() {
                return skip_abstract_paren;
            }

            public int getIs_wikipedia() {
                return is_wikipedia;
            }

            public String getSource_skip() {
                return source_skip;
            }

            public int getIs_fanon() {
                return is_fanon;
            }

            public int getIs_mediawiki() {
                return is_mediawiki;
            }

            public String getSrc_info() {
                return src_info;
            }
        }

        public static class DeveloperEntity {
            private String name;
            private String url;
            private String type;

            public static DeveloperEntity objectFromData(String str) {

                return new Gson().fromJson(str, DeveloperEntity.class);
            }

            public void setName(String name) {
                this.name = name;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getName() {
                return name;
            }

            public String getUrl() {
                return url;
            }

            public String getType() {
                return type;
            }
        }
    }

    public static class RelatedTopicsEntity {
        private String Result;
        /**
         * URL : https://duckduckgo.com/i/20c62706.png
         * Height :
         * Width :
         */

        private IconEntity Icon;
        private String FirstURL;
        private String Text;

        public static RelatedTopicsEntity objectFromData(String str) {

            return new Gson().fromJson(str, RelatedTopicsEntity.class);
        }

        public void setResult(String Result) {
            this.Result = Result;
        }

        public void setIcon(IconEntity Icon) {
            this.Icon = Icon;
        }

        public void setFirstURL(String FirstURL) {
            this.FirstURL = FirstURL;
        }

        public void setText(String Text) {
            this.Text = Text;
        }

        public String getResult() {
            return Result;
        }

        public IconEntity getIcon() {
            return Icon;
        }

        public String getFirstURL() {
            return FirstURL;
        }

        public String getText() {
            return Text;
        }

        public static class IconEntity {
            private String URL;
            private String Height;
            private String Width;

            public static IconEntity objectFromData(String str) {

                return new Gson().fromJson(str, IconEntity.class);
            }

            public void setURL(String URL) {
                this.URL = URL;
            }

            public void setHeight(String Height) {
                this.Height = Height;
            }

            public void setWidth(String Width) {
                this.Width = Width;
            }

            public String getURL() {
                return URL;
            }

            public String getHeight() {
                return Height;
            }

            public String getWidth() {
                return Width;
            }
        }
    }
}