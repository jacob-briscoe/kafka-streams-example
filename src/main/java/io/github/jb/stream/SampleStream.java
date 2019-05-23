package io.github.jb.stream;

import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.kstream.KStream;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class SampleStream {

	@Bean
	public KStream<Integer, String> plaintextInputStream(final StreamsBuilder streamsBuilder) {
		final KStream<Integer, String> stream = streamsBuilder.stream("streams-plaintext-input");

		stream.to("streams-pipe-output");

		return stream;
	}

}
