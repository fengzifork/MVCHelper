package com.shizhefei.mvc.viewhandler;

import android.view.View;
import android.view.View.OnClickListener;

import com.shizhefei.mvc.IDataAdapter;
import com.shizhefei.mvc.ILoadViewFactory.ILoadMoreView;
import com.shizhefei.mvc.MVCHelper.OnScrollBottomListener;

public interface ViewHandler {

	/**
	 *
	 * @param contentView
	 * @param adapter
	 * @param loadMoreView
	 * @param onClickLoadMoreListener
     * @return 是否有 init ILoadMoreView
     */
	boolean handleSetAdapter(View contentView, IDataAdapter<?> adapter, ILoadMoreView loadMoreView, OnClickListener onClickLoadMoreListener);

	void setOnScrollBottomListener(View contentView, OnScrollBottomListener onScrollBottomListener);

}
