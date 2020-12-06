package com.romychsa.favorito_mascota.RestApi;

public class ConstantesRestApi {
    public static final String COD_USER_PERMISSION = "/me/";
    public static final String URL_BASIC_GRAPH = "https://graph.instagram.com" + COD_USER_PERMISSION;
    public static final String TYPE_ACCION_PERMISSION = "media?fields=";
    public static final String TYPES_ACCESS_MEDIA = "id,media_url,caption,timestamp,media_type,permalink,thumbnail_url,username";
    public static final String ASK_FOR_ACCESS_TOKEN= "&access_token=";
    public static final String ACCESS_TOKEN = "IGQVJXRy00MnhsZA0hud2ZAXQVRLOE96dEhTUDJ6Y3lMcTd5bEM5eXhqbHFfMllIVEM0enZAGdGd0SGFEV2dnZAlNEUnJtT2lNUmV4cFpsU1BjREc5Y29ZAYUxQVDVTMk5Vc2ZAYdGRzeHp5NWxkVTVfUVVyQQZDZD";
    public static final String ACCESS_TOKEN_2 = "IGQVJXZAFA0QmNiWGxmYTR5dmdfT2JQWFBHQ1NQMjhNOFRtSE4yc2tMa3Qtbjc5cG0wVW5CX1R1N2wwUGRnM3doV2I1aGpjUlVuNXlVbDJMQkRQcEJPQ1RQT1JpRDFYdW54WWRfNTBOUFRUdE1nMk5sSgZDZD";
    public static final String URL_GET_RECENT_MEDIA_USER = URL_BASIC_GRAPH + TYPE_ACCION_PERMISSION + TYPES_ACCESS_MEDIA + ASK_FOR_ACCESS_TOKEN + ACCESS_TOKEN ;
    public static final String URL_GET_RECENT_MEDIA_USER_2 = URL_BASIC_GRAPH + TYPE_ACCION_PERMISSION + TYPES_ACCESS_MEDIA + ASK_FOR_ACCESS_TOKEN + ACCESS_TOKEN_2;

    //https://graph.instagram.com/me/media?fields=id,media_url,caption,timestamp,media_type,permalink,thumbnail_url,username&access_token={poner access-token}

}
