
import java.time.Duration;
import java.util.*;

import io.gatling.javaapi.core.*;
import io.gatling.javaapi.http.*;
import io.gatling.javaapi.jdbc.*;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;
import static io.gatling.javaapi.jdbc.JdbcDsl.*;

public class RecordedSimulation extends Simulation {

  private HttpProtocolBuilder httpProtocol = http
    .baseUrl("https://jsfiddle.net")
    .inferHtmlResources(AllowList(), DenyList())
    .acceptEncodingHeader("gzip, deflate")
    .acceptLanguageHeader("en-US,en;q=0.9,es-419;q=0.8,es;q=0.7,zh-TW;q=0.6,zh;q=0.5")
    .userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/101.0.4951.67 Safari/537.36");
  
  private Map<CharSequence, String> headers_0 = Map.ofEntries(
    Map.entry("Accept-Encoding", "gzip, deflate"),
    Map.entry("Cache-Control", "no-cache"),
    Map.entry("Pragma", "no-cache"),
    Map.entry("Proxy-Connection", "keep-alive")
  );
  
  private Map<CharSequence, String> headers_1 = Map.ofEntries(
    Map.entry("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9"),
    Map.entry("Cache-Control", "max-age=0"),
    Map.entry("Sec-Fetch-Dest", "document"),
    Map.entry("Sec-Fetch-Mode", "navigate"),
    Map.entry("Sec-Fetch-Site", "same-origin"),
    Map.entry("Sec-Fetch-User", "?1"),
    Map.entry("Upgrade-Insecure-Requests", "1"),
    Map.entry("sec-ch-ua", "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"101\", \"Google Chrome\";v=\"101\""),
    Map.entry("sec-ch-ua-mobile", "?0"),
    Map.entry("sec-ch-ua-platform", "\"Windows\"")
  );
  
  private Map<CharSequence, String> headers_2 = Map.ofEntries(
    Map.entry("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9"),
    Map.entry("Cache-Control", "max-age=0"),
    Map.entry("Origin", "https://jsfiddle.net"),
    Map.entry("Sec-Fetch-Dest", "document"),
    Map.entry("Sec-Fetch-Mode", "navigate"),
    Map.entry("Sec-Fetch-Site", "same-origin"),
    Map.entry("Sec-Fetch-User", "?1"),
    Map.entry("Upgrade-Insecure-Requests", "1"),
    Map.entry("sec-ch-ua", "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"101\", \"Google Chrome\";v=\"101\""),
    Map.entry("sec-ch-ua-mobile", "?0"),
    Map.entry("sec-ch-ua-platform", "\"Windows\"")
  );
  
  private Map<CharSequence, String> headers_3 = Map.ofEntries(
    Map.entry("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9"),
    Map.entry("Sec-Fetch-Dest", "document"),
    Map.entry("Sec-Fetch-Mode", "navigate"),
    Map.entry("Sec-Fetch-Site", "same-origin"),
    Map.entry("Sec-Fetch-User", "?1"),
    Map.entry("Upgrade-Insecure-Requests", "1"),
    Map.entry("sec-ch-ua", "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"101\", \"Google Chrome\";v=\"101\""),
    Map.entry("sec-ch-ua-mobile", "?0"),
    Map.entry("sec-ch-ua-platform", "\"Windows\"")
  );
  
  private Map<CharSequence, String> headers_4 = Map.ofEntries(
    Map.entry("Accept", "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8"),
    Map.entry("Sec-Fetch-Dest", "image"),
    Map.entry("Sec-Fetch-Mode", "same-origin"),
    Map.entry("Sec-Fetch-Site", "same-origin"),
    Map.entry("sec-ch-ua", "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"101\", \"Google Chrome\";v=\"101\""),
    Map.entry("sec-ch-ua-mobile", "?0"),
    Map.entry("sec-ch-ua-platform", "\"Windows\"")
  );
  
  private Map<CharSequence, String> headers_7 = Map.ofEntries(
    Map.entry("Accept", "text/css,*/*;q=0.1"),
    Map.entry("Sec-Fetch-Dest", "style"),
    Map.entry("Sec-Fetch-Mode", "no-cors"),
    Map.entry("Sec-Fetch-Site", "same-origin"),
    Map.entry("sec-ch-ua", "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"101\", \"Google Chrome\";v=\"101\""),
    Map.entry("sec-ch-ua-mobile", "?0"),
    Map.entry("sec-ch-ua-platform", "\"Windows\"")
  );
  
  private Map<CharSequence, String> headers_8 = Map.ofEntries(
    Map.entry("Accept", "*/*"),
    Map.entry("Sec-Fetch-Dest", "script"),
    Map.entry("Sec-Fetch-Mode", "no-cors"),
    Map.entry("Sec-Fetch-Site", "same-origin"),
    Map.entry("sec-ch-ua", "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"101\", \"Google Chrome\";v=\"101\""),
    Map.entry("sec-ch-ua-mobile", "?0"),
    Map.entry("sec-ch-ua-platform", "\"Windows\"")
  );
  
  private String uri2 = "http://www.gstatic.com/generate_204";

  private ScenarioBuilder scn = scenario("RecordedSimulation")
    .exec(
      http("request_0")
        .get(uri2)
        .headers(headers_0)
    )
    .pause(3)
    .exec(
      http("request_1")
        .get("/user/login/")
        .headers(headers_1)
    )
    .pause(7)
    .exec(
      http("request_2")
        .post("/user/login/")
        .headers(headers_2)
        .formParam("authenticity_token", "cKE/VKWE0VGf4xVMh4+/UqufUoluP8ieQLSpH0uro5qP5KnEdZhM+kC+3M4E1yVArztXufLk+vw4BXobMOxC/Q==")
        .formParam("email", "jaysson1710")
        .formParam("password", "Maestro1.")
    )
    .pause(8)
    .exec(
      http("request_3")
        .get("/user/fiddles/all/")
        .headers(headers_3)
        .resources(
          http("request_4")
            .get("/sprite.svg")
            .headers(headers_4)
        )
    )
    .pause(1)
    .exec(
      http("request_5")
        .get("/user/fiddles/private/")
        .headers(headers_3)
    )
    .pause(1)
    .exec(
      http("request_6")
        .get("/")
        .headers(headers_3)
        .resources(
          http("request_7")
            .get("/css/dist-editor-dark.css?2d679975d1e9d94fbf221ff6785c3cc5a037a4a5")
            .headers(headers_7),
          http("request_8")
            .get("/js/_dist-editor.js?2d679975d1e9d94fbf221ff6785c3cc5a037a4a5")
            .headers(headers_8)
        )
    )
    .pause(10)
    .exec(
      http("request_9")
        .get("/user/logout/")
        .headers(headers_3)
        .resources(
          http("request_10")
            .get("/css/dist-editor-dark.css?c4e277a0d67ca7478c806284d450904c3327470b")
            .headers(headers_7),
          http("request_11")
            .get("/js/_dist-editor.js?c4e277a0d67ca7478c806284d450904c3327470b")
            .headers(headers_8)
        )
    );

  {
	  setUp(scn.injectOpen(atOnceUsers(1))).protocols(httpProtocol);
  }
}
