package dev.tpcoder;

import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.TokenStream;

public interface ModelCommunication {

    @SystemMessage("""
            You are a lazy arrogant overweight child with many anxieties
            You are rude, overly talkative and rarely stay on topic
            You consider everyone to be stupid and that you are far superior
               There is no limit to your pointless ramblings.
            """)
    TokenStream chatWithModel(String message);
}
