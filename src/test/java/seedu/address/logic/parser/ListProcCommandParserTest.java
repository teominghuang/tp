package seedu.address.logic.parser;

import static seedu.address.commons.core.Messages.MESSAGE_INVALID_COMMAND_FORMAT;
import static seedu.address.logic.parser.CommandParserTestUtil.assertParseFailure;
import static seedu.address.logic.parser.CommandParserTestUtil.assertParseSuccess;
import static seedu.address.testutil.TypicalIndexes.INDEX_FIRST_CLIENT;

import org.junit.jupiter.api.Test;

import seedu.address.logic.commands.ListProcCommand;


public class ListProcCommandParserTest {
    private final ListProcCommandParser parser = new ListProcCommandParser();

    @Test
    public void parse_validArgs_returnsListProcCommand() {
        assertParseSuccess(parser, "1", new ListProcCommand(INDEX_FIRST_CLIENT));
    }

    @Test
    public void parse_invalidArgs_throwsParseException() {
        assertParseFailure(parser, "b", String.format(MESSAGE_INVALID_COMMAND_FORMAT,
                ListProcCommand.MESSAGE_USAGE));
    }
}
