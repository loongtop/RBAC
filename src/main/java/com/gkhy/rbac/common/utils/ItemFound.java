package com.gkhy.rbac.common.utils;

import com.gkhy.rbac.common.result.Result;
import lombok.experimental.UtilityClass;

@UtilityClass
public final class ItemFound {

    public static Result fail() {
        return Result.fail().message("Item was not found in the database!");
    }
}
