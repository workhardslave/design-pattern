package builder;

public class Html {
    private String text;

    private Html() { };

    @Override
    public String toString() {
        return text;
    }

    public static class Builder {
        private String title;
        private String content;
        private String[] items;

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder content(String content) {
            this.content = content;
            return this;
        }

        public Builder items(String... items) {
            this.items = items;
            return this;
        }

        public Html build() {
            Html html = new Html();

            StringBuilder sb = new StringBuilder();
            sb.append("<html>").append("\n");
            sb.append("<title>").append(title).append("</title>\n");
            sb.append("<body>").append("\n");
            sb.append(content).append("\n");
            sb.append("  <ul>").append("\n");
            for (String item : items) {
                sb.append("     <li>").append(item).append("</li>").append("\n");
            }
            sb.append("  </ul>").append("\n");
            sb.append("</body>").append("\n");
            sb.append("</html>").append("\n");

            html.text = sb.toString();
            return html;
        }
    }
}
