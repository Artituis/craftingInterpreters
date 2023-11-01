package lox;

class Token {
    final TokenType type;
    final String lexeme;
    final Object literal;
    // This is to indicate in what line an error has occurred
    final int line;

    Token(TokenType type, String lexeme, Object literal, int line) {
        this.type = type;
        this.lexeme = lexeme;
        this.literal = literal;
        this.line = line;
    }

    public String toString() {
        return type + " " + lexeme + " " + literal;
    }
}