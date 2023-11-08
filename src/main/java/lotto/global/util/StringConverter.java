package lotto.global.util;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.mockito.internal.util.collections.ListUtil.Converter;

public class StringConverter {
    public static class StringToIntegerListConverter implements Converter<String, List<Integer>> {
        @Override
        public List<Integer> convert(String from) throws NumberFormatException {
            List<String> strings = Arrays.asList(from.split(","));
            return strings.stream().map(s -> Integer.parseInt(s)).collect(Collectors.toList());
        }
    }

    public static class IntegerListToStringConverter implements Converter<List<Integer>, String>{
        @Override
        public String convert(List<Integer> from) {
            List<String> strings = from.stream().map(integer -> String.valueOf(integer)).collect(Collectors.toList());
            return String.join(",", strings);
        }
    }

}