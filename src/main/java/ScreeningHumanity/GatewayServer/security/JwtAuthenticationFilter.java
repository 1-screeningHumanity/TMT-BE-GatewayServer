//package ScreeningHumanity.GatewayServer.security;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.fasterxml.jackson.databind.node.ObjectNode;
//import jakarta.servlet.FilterChain;
//import jakarta.servlet.ServletException;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import jakarta.validation.constraints.NotNull;
//import java.io.IOException;
//import java.io.PrintWriter;
//import lombok.RequiredArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.HttpStatus;
//import org.springframework.stereotype.Component;
//import org.springframework.web.filter.OncePerRequestFilter;
//
//@Slf4j
//@Component
//@RequiredArgsConstructor
//public class JwtAuthenticationFilter extends OncePerRequestFilter {
//
//    private final JwtTokenProvider jwtTokenProvider;
//
//    @Override
//    protected void doFilterInternal(
//            @NotNull HttpServletRequese request,
//            @NotNull HttpServletResponse response,
//            @NotNull FilterChain filterChain
//    ) throws ServletException, IOException {
//        final String authHeader = request.getHeader(HttpHeaders.AUTHORIZATION);
//        final String jwt;
//
//        if (authHeader == null || !authHeader.startsWith("Bearer ")) {
//            filterChain.doFilter(request, response);
//            return;
//        }
//
//        jwt = authHeader.substring(7);
//        try {
//            jwtTokenProvider.isTokenExpired(jwt);
//        } catch (Exception e) {
//            log.info("Token exception : {}", e.getMessage());
//            responseError(response, jwt);
//            return;
//        }
//
//        filterChain.doFilter(request, response);
//    }
//
//    private void responseError(HttpServletResponse response, String jwt) throws IOException {
//        log.error("Jwt Token is Expired = {}", jwt);
//        response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
//        response.setContentType("application/json");
//        response.setCharacterEncoding("UTF-8");
//
//        ObjectMapper mapper = new ObjectMapper();
//        ObjectNode jsonResponse = mapper.createObjectNode();
//        jsonResponse.put("httpStatus", HttpStatus.UNAUTHORIZED.getReasonPhrase());
//        jsonResponse.put("isSuccess", "false");
//        jsonResponse.put("message", " 토큰이 만료되었습니다.");
//        jsonResponse.put("code", "9999");
//
//        PrintWriter out = response.getWriter();
//        out.print(jsonResponse.toString());
//    }
//}
