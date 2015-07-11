package org.asciidoctor.markdown

import org.asciidoctor.converters.AbstractMarkdownConverter

/**
 * @author Schalk W. Cronjé
 */
class MarkdownConverter extends AbstractMarkdownConverter {
    MarkdownConverter(final String backend,Map<String, Object> opts) {
        super(backend, opts)
    }
}
