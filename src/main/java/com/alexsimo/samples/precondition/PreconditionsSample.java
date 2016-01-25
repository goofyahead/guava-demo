package com.alexsimo.samples.precondition;

import static com.google.common.base.Preconditions.checkNotNull;
import static com.google.common.base.Preconditions.checkState;

public class PreconditionsSample {
    public static void main(String[] args) {
        checkState(args.length > 0, "Too less parameters");
        checkNotNull(args, "You have to pass some parameters");
    }
}
