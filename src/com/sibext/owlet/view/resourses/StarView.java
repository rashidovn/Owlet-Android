/**
 * This file is part of Owlet.
 * 
 * Owlet is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *  
 * Owlet is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *  
 * You should have received a copy of the GNU General Public License
 * along with Owlet.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.sibext.owlet.view.resourses;


import android.content.Context;

import com.sibext.owlet.R;
import com.sibext.owlet.view.TaskImageViewFromResourse;
import com.sibext.owlet.view.renderer.Renderer;

/**
 * The star's set includes star, leaf, flower and shell figure
 * 
 * @author Nikolay Moskvin <moskvin@sibext.com>
 * 
 */
public class StarView extends TaskImageViewFromResourse {
	/**
	 * The standard constructor for inflate new task image view from current set
	 * 
	 * @param context
	 *            the android context
	 * @param renderer
	 *            the object with information about how display current set
	 */
	public StarView(Context context, Renderer renderer) {
		super(context, renderer);
	}

	@Override
	protected int[] getResourcesIds() {
		return new int[]{
				R.drawable.star,
				R.drawable.leaf,
				R.drawable.flower,
				R.drawable.shell,
		};
	}

}

